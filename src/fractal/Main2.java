package fractal;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main2 {

    /**
     * Начальный размер окна.
     */
    public static int width = 800, height = 600;

    /**
     * Создаёт, настраивает и выводит фрейм для прорисовки кривой Коха.
     *
     * @param args аргумент командной строки.
     */
    public static void main(String[] args) {
        final Frame fr = new Frame("Кривая Коха");
        fr.setSize(width, height);
        fr.add(new Fractal());
        fr.setVisible(true);
        fr.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                fr.dispose();
            }
        });

    }

}