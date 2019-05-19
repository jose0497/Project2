/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author jose0
 */
public class CharacterRute3 extends Character{
    private ArrayList<Position> positions;
    private boolean reverse;
    private int x;
    private int y;
    private ImageIO imageIO;
    private ArrayList<Image> sprite;
    private boolean curve = false;

    public CharacterRute3(int x, int y, int imgNum) throws FileNotFoundException, IOException {
        super(x, y, imgNum);
        this.positions = new ArrayList<>();
        setSprite();
        setPosition();
        this.x = x;
        this.y = y;
        this.reverse = false;

    }

    public void setSprite() throws FileNotFoundException, IOException {
        sprite = super.getSprite();

        for (int i = 0; i <= 9; i++) {
            sprite.add(imageIO.read(new FileInputStream("src/Assets/SpritesMegamanX/" + i + ".png")));
        }
        for (int i = 0; i <= 9; i++) {
            sprite.add(imageIO.read(new FileInputStream("src/Assets/SpritesMegamanX/" + i + "R" + ".png")));
        }

        super.setSprite(sprite);
    }

    public void setPosition() {
        this.positions.add(new Position(420, 320));
        this.positions.add(new Position(435, 320));
        this.positions.add(new Position(450, 320));
        this.positions.add(new Position(465, 320));
        this.positions.add(new Position(480, 320));
        this.positions.add(new Position(495, 320));
        this.positions.add(new Position(500, 320));
        this.positions.add(new Position(515, 320));
        this.positions.add(new Position(530, 320));
        this.positions.add(new Position(545, 320));
        this.positions.add(new Position(560, 320));
        this.positions.add(new Position(570, 320));
        //primera curva
        this.positions.add(new Position(580, 320));
        //dando la curva1
        this.positions.add(new Position(600, 285));
        this.positions.add(new Position(600, 287));
        this.positions.add(new Position(630, 278));
        this.positions.add(new Position(632, 266));
        this.positions.add(new Position(635, 251));
        this.positions.add(new Position(640, 235));
        this.positions.add(new Position(655, 209));
        this.positions.add(new Position(640, 192));
        this.positions.add(new Position(635, 170));
        this.positions.add(new Position(632, 156));
        this.positions.add(new Position(630, 145));
        this.positions.add(new Position(600, 134));
        //fin curva1
        //empieza recta de arriba, resto x
        this.positions.add(new Position(580, 90));
        this.positions.add(new Position(544, 90));
        this.positions.add(new Position(535, 90));
        this.positions.add(new Position(528, 90));
        this.positions.add(new Position(520, 90));
        this.positions.add(new Position(512, 90));
        this.positions.add(new Position(505, 90));
        this.positions.add(new Position(496, 90));
        this.positions.add(new Position(490, 90));
        this.positions.add(new Position(482, 90));
        this.positions.add(new Position(475, 90));
        this.positions.add(new Position(468, 90));
        this.positions.add(new Position(460, 90));
        this.positions.add(new Position(452, 90));
        this.positions.add(new Position(445, 90));
        this.positions.add(new Position(438, 90));
        this.positions.add(new Position(430, 90));
        this.positions.add(new Position(422, 90));
        this.positions.add(new Position(415, 90));
        this.positions.add(new Position(408, 90));
        this.positions.add(new Position(400, 90));
        this.positions.add(new Position(392, 90));
        this.positions.add(new Position(385, 90));
        this.positions.add(new Position(377, 90));
        this.positions.add(new Position(370, 90));
        this.positions.add(new Position(362, 90));
        this.positions.add(new Position(355, 90));
        this.positions.add(new Position(340, 90));
        this.positions.add(new Position(325, 90));
        this.positions.add(new Position(310, 90));
        this.positions.add(new Position(295, 90));
        this.positions.add(new Position(280, 90));
        this.positions.add(new Position(265, 90));
        this.positions.add(new Position(250, 90));
        this.positions.add(new Position(235, 90));
        this.positions.add(new Position(220, 90));
        this.positions.add(new Position(205, 90));
        this.positions.add(new Position(190, 90));
        //ultimo punto de recta arriba
        this.positions.add(new Position(177, 90));
        //empieza curva 2
        this.positions.add(new Position(145, 148));
        this.positions.add(new Position(125, 171));
        this.positions.add(new Position(120, 192));
        this.positions.add(new Position(118, 219));
        this.positions.add(new Position(125, 243));
        this.positions.add(new Position(141, 266));
        this.positions.add(new Position(155, 284));
        this.positions.add(new Position(173, 293));
        this.positions.add(new Position(193, 290));
        //termina curva 2, empieza recta final, sumo x
        this.positions.add(new Position(210, 290));
        this.positions.add(new Position(225, 290));
        this.positions.add(new Position(240, 290));
        this.positions.add(new Position(255, 290));
        this.positions.add(new Position(270, 290));
        this.positions.add(new Position(295, 290));
        this.positions.add(new Position(310, 290));
        this.positions.add(new Position(325, 290));
        this.positions.add(new Position(340, 290));
        this.positions.add(new Position(355, 290));
        this.positions.add(new Position(370, 290));
        this.positions.add(new Position(393, 290));
        //llegamos a la meta

    }

    @Override
    public void run() {
        ArrayList<Image> sprite = super.getSprite();
        while (true) {
            try {
                Thread.sleep(20);
                try {
                    while (!reverse) {
                        moveDEL();
                    }

                } catch (BootstrapMethodError | InternalError br) {
                } catch (Throwable ex) {
                    Logger.getLogger(Example.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(CharacterRute2.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void moveDEL() throws InterruptedException {
        int aux = 0;
        int countSprite = 0;
        for (int i = 0; i < this.positions.size(); i++) {
            if (i >= 11 && i <= 68) {
                //countSprite = 10;
                super.setImage(sprite.get(countSprite));
                if (countSprite == 18) {
                    countSprite = 10;
                } else {
                    countSprite++;

                }
            } else if (i >= 69 || i <= 11) {
                
                countSprite = aux;
                if (countSprite == 9) {
                    countSprite = 0;
                    aux = 0;
                } else {
                    countSprite++;
                    aux = countSprite;
                }
                super.setImage(sprite.get(countSprite));
            }
            Thread.sleep(180);
            super.setX(this.positions.get(i).getX());
            super.setY(this.positions.get(i).getY());
        }
    }
}
