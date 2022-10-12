package com.csci927.pandemicaservice3;

public interface QRCodeService {
    byte[] generateQRCode(String qrContent, int width, int height);
}
