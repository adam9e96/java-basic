package image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class ImageToBitmap {
    public static void main(String[] args) {
        try {
            // 절대 경로 사용 예시
            String absolutePath = "C:\\dev\\projects\\java-basic\\src\\image\\image\\image-test.png";
            File inputFile = new File(absolutePath);

            // 파일 경로 출력하여 디버깅
            System.out.println("File path: " + inputFile.getAbsolutePath());

            if (!inputFile.exists()) {
                System.err.println("File does not exist at path: " + inputFile.getAbsolutePath());
                return;
            }

            BufferedImage image = ImageIO.read(inputFile);

            if (image == null) {
                System.err.println("Failed to load image from file: " + inputFile.getAbsolutePath());
                return;
            }

            // 이미지를 비트맵 형식으로 변환
            byte[] bitmapData = convertToBitmap(image);

            // 이진 데이터 출력
            System.out.println(Arrays.toString(bitmapData));
        } catch (IOException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }

    private static byte[] convertToBitmap(BufferedImage image) throws IOException {
        // 비트맵 파일 헤더 작성
        int width = image.getWidth();
        int height = image.getHeight();
        int bitsPerPixel = 24; // RGB

        int fileSize = 54 + (width * height * 3);
        ByteBuffer buffer = ByteBuffer.allocate(fileSize);

        // BMP 헤더
        buffer.put((byte) 'B');
        buffer.put((byte) 'M');
        buffer.putInt(fileSize);
        buffer.putInt(0); // Reserved
        buffer.putInt(54); // Data offset

        // DIB 헤더
        buffer.putInt(40); // DIB 헤더 크기
        buffer.putInt(width);
        buffer.putInt(height);
        buffer.putShort((short) 1); // Color planes
        buffer.putShort((short) bitsPerPixel);
        buffer.putInt(0); // Compression (0 = None)
        buffer.putInt(width * height * 3); // Image size
        buffer.putInt(0); // X pixels per meter
        buffer.putInt(0); // Y pixels per meter
        buffer.putInt(0); // Colors in color table
        buffer.putInt(0); // Important color count

        // 이미지 데이터 추가 (픽셀 데이터)
        for (int y = height - 1; y >= 0; y--) {
            for (int x = 0; x < width; x++) {
                int rgb = image.getRGB(x, y);
                buffer.put((byte) (rgb & 0xFF));        // Blue
                buffer.put((byte) ((rgb >> 8) & 0xFF)); // Green
                buffer.put((byte) ((rgb >> 16) & 0xFF));// Red
            }
        }

        return buffer.array();
    }
}
