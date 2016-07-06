package org.utn.frd.lsi;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.discovery.NativeDiscovery;

public class Prueba {

    private JFrame frame;
    private EmbeddedMediaPlayerComponent mediaPlayerComponent;

    public static void main(final String[] args) {
        new NativeDiscovery().discover();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Prueba(args);
            }
        });
    }

    public Prueba(String[] args) {
        frame = new JFrame("Prueba de Camara");
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        frame.setContentPane(mediaPlayerComponent);
        frame.setVisible(true);
        mediaPlayerComponent.getMediaPlayer().playMedia("http://192.168.1.100:8080/video");        
    }
}
