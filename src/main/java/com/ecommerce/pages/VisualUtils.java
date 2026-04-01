package com.ecommerce.utils;

public class VisualUtils {
    // Método para pausar la ejecución y poder ver el proceso (Solo para demos)
    public static void pausar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
