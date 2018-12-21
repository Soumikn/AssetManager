package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;

import java.util.ArrayList;

import sun.rmi.runtime.Log;


public class MyGdxGame extends ApplicationAdapter {

	private Stage stage;
	public static AssetManager manager;
	private com.badlogic.gdx.scenes.scene2d.ui.Image image;
	private ArrayList<Pets> dogsArrayList;
	private ArrayList<Pets> fishsArrayList;
	private ArrayList<Pets> catsArrayList;






	@Override
	public void create () {
		stage = new Stage();

		dogsArrayList  = new ArrayList<Pets>();

		fishsArrayList  = new ArrayList<Pets>();

		catsArrayList  = new ArrayList<Pets>();

		Gdx.input.setInputProcessor(stage);
		manager = new AssetManager();




		manager.load("android/assets/badlogic.jpg", Texture.class);

		manager.load("android/assets/music.mp3", Music.class);

		manager.finishLoading();

		image = new com.badlogic.gdx.scenes.scene2d.ui.Image(manager.get("android/assets/badlogic.jpg", Texture.class));
		image.setBounds(20, 30, 200, 200);
		Music music = manager.get("android/assets/music.mp3", Music.class);

		music.play();

		image.addAction(Actions.sequence(Actions.moveBy(30, 200), Actions.rotateBy(300, 200)));


		stage.addActor(image);

		 Pets dog;
		 Pets fish;
		 Pets cat;


			Pets dogs  = new Pets();
			dogs.setName("asd");
			dogs.setAge(5);
			dogs.setColour("red");
			dogs.setFriendly(true);
		dogsArrayList.add(dogs);

		Pets fishs  = new Pets();
			fishs.setName("qwe");
			fishs.setAge(4);
			fishs.setColour("balack");
		fishsArrayList.add(fishs);

		Pets cats  = new Pets();
			cats.setName("bnm");
			cats.setAge(51);
			cats.setColour("gray");
		catsArrayList.add(cats);







//		 dog=new Pets(15,"ABC","RED",true);
//		 fish=new Pets(10,"XYZ","BLUE",true);
//		 cat=new Pets(25,"RST","GREEN",true);


		System.out.println("DOG : " +dogsArrayList.get(0).getName()+","+dogsArrayList.get(0).getAge()+","+dogsArrayList.get(0).getColour());
		System.out.println("FISh : " +fishsArrayList.get(0).getName()+","+fishsArrayList.get(0).getAge()+","+fishsArrayList.get(0).getColour());
		System.out.println("Cat: " +catsArrayList.get(0).getName()+","+catsArrayList.get(0).getAge()+","+catsArrayList.get(0).getColour());




	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
super.render();

stage.act(Gdx.graphics.getDeltaTime());
stage.draw();
	}

}


