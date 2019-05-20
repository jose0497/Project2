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
import javax.swing.JOptionPane;

/**
 *
 * @author jose0
 */
public class CharacterRute3 extends Character {

    private ArrayList<Position> positions;
    private boolean reverse;
    private int x;
    private int y;
    private ImageIO imageIO;
    private ArrayList<Image> sprite;
    private boolean curve = false;
    private int indexPosition;

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
        this.positions.add(new Position(640, 209));
        this.positions.add(new Position(645, 177));
        this.positions.add(new Position(640, 150));
        this.positions.add(new Position(635, 130));
        this.positions.add(new Position(632, 110));
        this.positions.add(new Position(630, 100));
        this.positions.add(new Position(610, 90));
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
        this.positions.add(new Position(153, 100));
        this.positions.add(new Position(129, 120));
        this.positions.add(new Position(118, 136));
        this.positions.add(new Position(109, 159));
        this.positions.add(new Position(103, 180));
        this.positions.add(new Position(102, 193));
        this.positions.add(new Position(100, 209));
        this.positions.add(new Position(102, 226));
        this.positions.add(new Position(103, 246));
        this.positions.add(new Position(116, 263));
        this.positions.add(new Position(124, 289));
        this.positions.add(new Position(140, 304));
        this.positions.add(new Position(157, 323));
        //termina curva 2, empieza recta final, sumo x
        this.positions.add(new Position(210, 323));
        this.positions.add(new Position(218, 323));
        this.positions.add(new Position(225, 323));
        this.positions.add(new Position(232, 323));
        this.positions.add(new Position(240, 323));
        this.positions.add(new Position(248, 323));
        this.positions.add(new Position(255, 323));
        this.positions.add(new Position(264, 323));
        this.positions.add(new Position(270, 323));
        this.positions.add(new Position(278, 323));
        this.positions.add(new Position(295, 323));
        this.positions.add(new Position(305, 323));
        this.positions.add(new Position(310, 323));
        this.positions.add(new Position(318, 323));
        this.positions.add(new Position(325, 323));
        this.positions.add(new Position(333, 323));
        this.positions.add(new Position(340, 323));
        this.positions.add(new Position(348, 323));
        this.positions.add(new Position(355, 323));
        this.positions.add(new Position(365, 323));
        this.positions.add(new Position(370, 323));
        this.positions.add(new Position(385, 323));
        this.positions.add(new Position(393, 323));
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
                    while (reverse) {
                        moveTRAS();
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
        for (int i = this.indexPosition; i < this.positions.size(); i++) {
            if (i >= 11 && i <= 68) {
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
            this.indexPosition = i;
        }
    }

    public void moveTRAS() throws InterruptedException {
        int aux = 0;
        int countSprite = 10;
        super.setImage(sprite.get(1));
        for (int i = this.indexPosition; i >= 0; i--) {
            if (i >= 25 && i <= 69) {
                countSprite = aux;
                if (countSprite == 9) {
                    countSprite = 0;
                    aux = 0;
                } else {
                    countSprite++;
                    aux = countSprite;
                }
                super.setImage(sprite.get(countSprite));
            } else if ((i <= 100 && i >= 70) || i <= 24) {

                super.setImage(sprite.get(countSprite));
                if (countSprite == 18) {
                    countSprite = 10;
                } else {
                    countSprite++;

                }
            }

            Thread.sleep(180);
            super.setX(this.positions.get(i).getX());
            super.setY(this.positions.get(i).getY());
            this.indexPosition = i;
            //fin del metodo
        }
    }

    public int getIndexPosition() {
        return indexPosition;
    }

    public void setIndexPosition(int indexPosition) {
        this.indexPosition = indexPosition;
    }

}
