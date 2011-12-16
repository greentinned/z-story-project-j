package com.zstoryproject;//import java.util.ArrayList;import java.util.Hashtable;import org.newdawn.slick.Animation;public class Entity {	protected float x;	protected float y;	private int animationWidth;	private int animationHeight;	// if true then make 2x zoom to any Entity 	public boolean zoom;	protected Hashtable<String, Animation> spriteAnimation;		protected Entity(Hashtable<String, Animation> animations, int x, int y){		this.spriteAnimation = animations;		this.x = x;		this.y = y;	}	public void draw(boolean zoom, String[] i){		//System.out.println(i[0]);		if (zoom == true){			animationWidth = spriteAnimation.get(i[0]).getWidth()*2;			animationHeight = spriteAnimation.get(i[0]).getHeight()*2;		} else {			animationWidth = spriteAnimation.get(i[0]).getWidth();			animationHeight = spriteAnimation.get(i[0]).getHeight();		}		if (x < 0) {			x = StartGame.WIDTH;		}		else if (x > StartGame.WIDTH) {			x = 0;		}		else if (y < 0) {			y = StartGame.HEIGHT;		}		else if (y > StartGame.HEIGHT) {			y = 0;		}		else {			x += Integer.valueOf(i[1]);			y += Integer.valueOf(i[2]);		}				spriteAnimation.get(i[0]).draw((int) x - animationWidth/2 , (int) y - animationHeight/2, animationWidth, animationHeight);		}}