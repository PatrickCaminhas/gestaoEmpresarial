package br.com.patrickcaminhas.gestaoEmpresarial.service;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class CriptografiaService {

    private static final String CHAVE_SECRETA = "ColocarEmVariavelDeAmbiente";

    private static final String CHAVE_16_BYTES = "1234567890123456";

    public static String encriptar(String valorOriginal) {
        try {
            SecretKeySpec secretKey = new SecretKeySpec(CHAVE_16_BYTES.getBytes(StandardCharsets.UTF_8), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] valorEncriptadoBytes = cipher.doFinal(valorOriginal.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(valorEncriptadoBytes);
        } catch (Exception e) {
            throw new IllegalStateException("Falha ao criptografar valor", e);
        }
    }

    public static String desencriptar(String valorEncriptado) {
        try {

            SecretKeySpec secretKey = new SecretKeySpec(CHAVE_16_BYTES.getBytes(StandardCharsets.UTF_8), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            byte[] valorDecodificado = Base64.getDecoder().decode(valorEncriptado);
            byte[] valorOriginalBytes = cipher.doFinal(valorDecodificado);
            return new String(valorOriginalBytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new IllegalStateException("Falha ao criptografar valor", e);
        }
    }
}
