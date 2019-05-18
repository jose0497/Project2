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
 * @author jordan
 */
public class Example extends Character {

    private int x;
    private int y;
    private int inicialX;
    private int inicialY;
    
    private int fastRunning;
    private ImageIO imageIO;
    private ArrayList<Image> sprite;

    public Example(int x, int y, int imgNum) throws FileNotFoundException, IOException {
        super(x, y, imgNum);
        setSprite();
        inicialX=x;
        inicialY=y;
        this.x = x;
        this.y = y;
        this.fastRunning = 0;
    }

    public void setSprite() throws FileNotFoundException, IOException {
        sprite = super.getSprite();

        for (int i = 0; i <= 7; i++) {
            sprite.add(imageIO.read(new FileInputStream("src/Assets/SpritesSonic/" + i + ".png")));
        }

        super.setSprite(sprite);
    }

    @Override
    public void run() {
        ArrayList<Image> sprite = super.getSprite();
        while (true) {
            try {
                super.setImage(sprite.get(0));
                super.setX(x);
                super.setY(y);
                move(90, 1);
                this.x=inicialX;
                this.y=inicialY;
            } catch (BootstrapMethodError br) {
            } catch (InternalError err) {
            } catch (InterruptedException ex) {
                Logger.getLogger(Example.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void move(int repeat, int dir) throws InterruptedException {
        int countSprite = 0;
        int countSpriteR = 31;

        if (dir == 1) {
            for (int i = 0; i <= repeat; i++) {
                Thread.sleep(60);
                super.setX(x);
                super.setImage(sprite.get(countSprite));

                x += 5;

                if (countSprite == super.sprite.size() - 1) {
                    countSprite = 0;
                } else {
                    countSprite++;
                }

            }
        }

        if (dir == 2) {
            for (int i = 0; i <= repeat; i++) {
                Thread.sleep(70);
                super.setX(x);
                super.setImage(sprite.get(countSpriteR));
                x -= 10;
                if (countSpriteR == 40) {
                    countSpriteR = 31;
                } else {
                    countSpriteR++;
                }
            }
        }
    }

    public void fastMove(int repeat) throws InterruptedException {
        for (int i = 0; i <= repeat; i++) {

            Thread.sleep(70);
            super.setX(x);
            super.setImage(sprite.get(fastRunning));
            x += 20;
            fastRunning++;
            if (fastRunning == 7) {
                fastRunning = 0;
            }
        }
    }

    public void jump(int repeat, int caida, int option) throws InterruptedException {
        int count = 51;
        if (option == 1) {
            for (int i = 0; i <= repeat; i++) {

                Thread.sleep(30);
                super.setImage(sprite.get(9));
                y -= 10;
                super.setY(y);
            }

        } else {
            //caida
            for (int i = 0; i < 5; i++) {
                super.setImage(sprite.get(count));
                Thread.sleep(50);
                y += 8;
                super.setY(y);
                count++;
            }

            super.setImage(sprite.get(10));
            for (int i = 0; i <= caida; i++) {
                Thread.sleep(25);
                super.setImage(sprite.get(11));
                y += 10;
                super.setY(y);

            }
            Thread.sleep(25);
            super.setImage(sprite.get(12));
        }
    }

    public void jumpMove(int repeat, int caida, int option) throws InterruptedException {
        int count = 51;
        if (option == 1) {
            for (int i = 0; i <= repeat; i++) {

                Thread.sleep(50);
                super.setImage(sprite.get(9));
                y -= 10;
                x += 4;
                super.setX(x);
                super.setY(y);
            }
        } else {
            //caida
            for (int i = 0; i < 5; i++) {
                super.setImage(sprite.get(count));
                Thread.sleep(50);
                y += 8;
                x += 8;
                super.setX(x);
                super.setY(y);
                count++;
            }

            super.setImage(sprite.get(10));
            for (int i = 0; i <= caida; i++) {
                Thread.sleep(40);
                super.setImage(sprite.get(11));
                y += 10;
                x += 4;
                super.setX(x);
                super.setY(y);

            }
            Thread.sleep(40);
            super.setImage(sprite.get(12));
        }
    }

    public void reverseJump(int repeat, int caida, int option) throws InterruptedException {
        if (option == 1) {
            for (int i = 0; i <= repeat; i++) {

                Thread.sleep(50);
                super.setImage(sprite.get(24));
                y -= 10;
                super.setY(y);
            }
        } else {
            //caida
            super.setImage(sprite.get(25));
            for (int i = 0; i <= caida; i++) {
                Thread.sleep(40);
                super.setImage(sprite.get(26));
                y += 10;
                super.setY(y);

                if (i == caida) {

                    Thread.sleep(40);
                    super.setImage(sprite.get(27));
                }

            }
            Thread.sleep(40);
            super.setImage(sprite.get(28));
        }

        super.setImage(sprite.get(23));
        Thread.sleep(100);
    }

    public void reverseJumpMove(int repeat, int caida, int option) throws InterruptedException {
        int count = 57;
        if (option == 1) {
            for (int i = 0; i <= repeat; i++) {

                Thread.sleep(50);
                super.setImage(sprite.get(24));
                y -= 10;
                x -= 4;
                super.setX(x);
                super.setY(y);
            }

        } else {
            //caida
            for (int i = 0; i < 4; i++) {
                super.setImage(sprite.get(count));
                Thread.sleep(50);
                y -= 8;
                x -= 8;
                super.setX(x);
                super.setY(y);
                count++;
            }

            super.setImage(sprite.get(25));
            for (int i = 0; i <= caida; i++) {
                Thread.sleep(40);
                super.setImage(sprite.get(26));
                y += 10;
                x -= 3;
                super.setX(x);
                super.setY(y);
                if (i == caida) {

                    Thread.sleep(40);
                    super.setImage(sprite.get(27));
                }

            }
            super.setImage(sprite.get(23));
            Thread.sleep(100);
        }

    }

    public void stading(int repeat) throws InterruptedException {
        int count = 28;

        for (int i = 0; i <= repeat; i++) {
            Thread.sleep(150);
            super.setImage(sprite.get(count));

            if (count == 30) {
                Thread.sleep(150);
                super.setImage(sprite.get(8));
                count = 28;
            } else {
                count++;
            }

        }
    }

}
