package com.csci927.pandemicaservice3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Base64;

@Controller
@RequestMapping("/qrcode")
public class QrcodeController {
    private final Logger logger = LoggerFactory.getLogger(QrcodeController.class);

    @Autowired
    QrcodeRepository qrcodeRepository;

    @Autowired
    private QRCodeService qrCodeService;

    @GetMapping
    public String renderQrCodePage(Model model) {
        model.addAttribute("qrcode", new QrcodeModel());
        return "qrcode";
    }

    @PostMapping("/generated")
    public String saveQrCodeDetails(@Valid QrcodeModel qrcodeModel, BindingResult result, Model model,HttpServletResponse response) throws IOException {
        String name = qrcodeModel.getName();
        String addres = qrcodeModel.getAddress();
        String email = qrcodeModel.getEmail();
        String combined = name+email+addres;

        response.setContentType("image/png");
        byte[] qrCode = qrCodeService.generateQRCode(combined, 500, 500);
        String imgStr = Base64.getEncoder().encodeToString(qrCode);
        model.addAttribute("qrCodeContent", "data:image/jpg;base64,"+ imgStr);
        return "show-qr-code";
    }

}
