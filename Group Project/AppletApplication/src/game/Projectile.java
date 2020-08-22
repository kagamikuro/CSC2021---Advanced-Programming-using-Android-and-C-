package game;

import java.awt.Rectangle;

public class Projectile {

	private int x, y, speedX;
	private boolean visible;
	
	private Rectangle r;
	
	public Projectile(int startX, int startY){
		x = startX;
		y = startY;
		speedX = 7;
		visible = true;
		
		r = new Rectangle(0, 0, 0, 0);
	}
	
	public void update(){
		x += speedX;
		r.setBounds(x, y, 10, 5);
		if (x > 800){
			visible = false;
			r = null;
		}
		if (x < 800){
			checkCollision();
		}
	}

	private void checkCollision() {
		if(r.intersects(StartingClass.hb.r)){
			visible = false;
		
			if (StartingClass.hb.health > 0) {
				StartingClass.hb.health -= 1;
			}
			if (StartingClass.hb.health == 0) {
				StartingClass.hb.setCenterX(-100);
				StartingClass.score += 100;

			}

		}
		
		if (r.intersects(StartingClass.hb2.r)){
			visible = false;

			if (StartingClass.hb2.health > 0) {
				StartingClass.hb2.health -= 1;
			}
			if (StartingClass.hb2.health == 0) {
				StartingClass.hb2.setCenterX(-100);
				StartingClass.score += 100;

			}

		}
		
		if (r.intersects(StartingClass.hb3.r)){
			visible = false;

			if (StartingClass.hb3.health > 0) {
				StartingClass.hb3.health -= 1;
			}
			if (StartingClass.hb3.health == 0) {
				StartingClass.hb3.setCenterX(-100);
				StartingClass.score += 100;

			}

		}
		
		if (r.intersects(StartingClass.hb4.r)){
			visible = false;

			if (StartingClass.hb4.health > 0) {
				StartingClass.hb4.health -= 1;
			}
			if (StartingClass.hb4.health == 0) {
				StartingClass.hb4.setCenterX(-100);
				StartingClass.score += 100;

			}

		}
		
		if (r.intersects(StartingClass.hb5.r)){
			visible = false;

			if (StartingClass.hb5.health > 0) {
				StartingClass.hb5.health -= 1;
			}
			if (StartingClass.hb5.health == 0) {
				StartingClass.hb5.setCenterX(-100);
				StartingClass.score += 100;

			}

		}
		
		if (r.intersects(StartingClass.hb6.r)){
			visible = false;

			if (StartingClass.hb6.health > 0) {
				StartingClass.hb6.health -= 1;
			}
			if (StartingClass.hb6.health == 0) {
				StartingClass.hb6.setCenterX(-100);
				StartingClass.score += 100;

			}

		}
	}


	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getSpeedX() {
		return speedX;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	
}
