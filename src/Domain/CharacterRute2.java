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
public class CharacterRute2 extends Character {

    private ArrayList<Position> positions;
    private boolean reverse;
    private int x;
    private int y;
    private ImageIO imageIO;
    private ArrayList<Image> sprite;
    private boolean curve = false;
    private int indexPosition;

    public CharacterRute2(int x, int y, int imgNum) throws FileNotFoundException, IOException {
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
        this.positions.add(new Position(420, 290));
        this.positions.add(new Position(435, 290));
        this.positions.add(new Position(450, 290));
        this.positions.add(new Position(465, 290));
        this.positions.add(new Position(480, 290));
        this.positions.add(new Position(495, 290));
        this.positions.add(new Position(500, 290));
        this.positions.add(new Position(515, 290));
        this.positions.add(new Position(530, 290));
        this.positions.add(new Position(545, 290));
        this.positions.add(new Position(560, 290));
        this.positions.add(new Position(570, 290));
        //primera curva
        this.positions.add(new Position(580, 290));
        //dando la curva1
        this.positions.add(new Position(585, 285));
        this.positions.add(new Position(587, 287));
        this.positions.add(new Position(614, 278));
        this.positions.add(new Position(617, 266));
        this.positions.add(new Position(620, 251));
        this.positions.add(new Position(625, 235));
        this.positions.add(new Position(634, 209));
        this.positions.add(new Position(630, 192));
        this.positions.add(new Position(625, 170));
        this.positions.add(new Position(620, 156));
        this.positions.add(new Position(615, 145));
        this.positions.add(new Position(578, 134));
        //fin curva1
        //empieza recta de arriba, resto x
        this.positions.add(new Position(550, 118));
        this.positions.add(new Position(544, 118));
        this.positions.add(new Position(535, 118));
        this.positions.add(new Position(528, 118));
        this.positions.add(new Position(520, 118));
        this.positions.add(new Position(512, 118));
        this.positions.add(new Position(505, 118));
        this.positions.add(new Position(496, 118));
        this.positions.add(new Position(490, 118));
        this.positions.add(new Position(482, 118));
        this.positions.add(new Position(475, 118));
        this.positions.add(new Position(468, 118));
        this.positions.add(new Position(460, 118));
        this.positions.add(new Position(452, 118));
        this.positions.add(new Position(445, 118));
        this.positions.add(new Position(438, 118));
        this.positions.add(new Position(430, 118));
        this.positions.add(new Position(422, 118));
        this.positions.add(new Position(415, 118));
        this.positions.add(new Position(408, 118));
        this.positions.add(new Position(400, 118));
        this.positions.add(new Position(392, 118));
        this.positions.add(new Position(385, 118));
        this.positions.add(new Position(377, 118));
        this.positions.add(new Position(370, 118));
        this.positions.add(new Position(362, 118));
        this.positions.add(new Position(355, 118));
        this.positions.add(new Position(340, 118));
        this.positions.add(new Position(325, 118));
        this.positions.add(new Position(310, 118));
        this.positions.add(new Position(295, 118));
        this.positions.add(new Position(280, 118));
        this.positions.add(new Position(265, 118));
        this.positions.add(new Position(250, 118));
        this.positions.add(new Position(235, 118));
        this.positions.add(new Position(220, 118));
        this.positions.add(new Position(205, 118));
        this.positions.add(new Position(190, 118));
        //ultimo punto de recta arriba
        this.positions.add(new Position(177, 118));
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
                Thread.sleep(60);
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
                //countSprite = 10;
                super.setImage(sprite.get(countSprite));
                if (countSprite == 18) {
                    countSprite = 10;
                } else {
                    countSprite++;

                }
            } else if (i >= 69 || i <= 11) {
                System.out.println("entra ");
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
            Thread.sleep(200);
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
            if (i >= 25 && i <= 64) {
                countSprite = aux;
                if (countSprite == 9) {
                    countSprite = 0;
                    aux = 0;
                } else {
                    countSprite++;
                    aux = countSprite;
                }
                super.setImage(sprite.get(countSprite));
            } else if ((i <= 85 && i >= 65) || i <= 24) {

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
