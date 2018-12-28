package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;


public class MyGdxGame extends ApplicationAdapter {



//	public Pets array;

	private Stage stage;
	public static AssetManager manager;
	private com.badlogic.gdx.scenes.scene2d.ui.Image image;


//	private ArrayList<Pets> petsArrayList;


	@Override
	public void create() {
		stage = new Stage();

//		petsArrayList = new ArrayList<Pets>();


		Gdx.input.setInputProcessor(stage);
		manager = new AssetManager();


		manager.load("badlogic.jpg", Texture.class);

		manager.load("song.mp3", Music.class);

		manager.finishLoading();

		image = new Image(manager.get("badlogic.jpg", Texture.class));
		image.setBounds(20, 30, 200, 200);
		Music music = manager.get("song.mp3", Music.class);

		music.play();

		image.addAction(Actions.sequence(Actions.moveBy(300, 200), Actions.rotateBy(300, 200)));

		stage.addActor(image);

		JsonReader temp = new JsonReader();
		JsonValue base = temp.parse(Gdx.files.internal("pets.json"));
		JsonValue pets = base.get("pets");
//		System.out.println(pets);

//		public static void main(String[] args) {

			Pets dog = new Pets();
			dog.name="Tommy";
			dog.age=6;
			dog.colour="yellow";
			dog.friendly=true;
		System.out.println(dog.name+"  "+dog.age+"  "+dog.colour+"  "+dog.friendly);

			Pets cat = new Pets();
			cat.name="Miu";
			cat.age=5;
			cat.colour="back";
			cat.friendly=true;
			System.out.println(cat.name+"  "+cat.age+"  "+cat.colour+"  "+cat.friendly);

			Pets fish = new Pets();
			fish.name="Fishe";
			fish.age=2;
			fish.colour="white";
			fish.friendly=false;
		System.out.println(fish.name+"  "+fish.age+"  "+fish.colour+"  "+fish.friendly);
//		}
//		for (JsonValue component : base.get("pets"))
//		{
//			System.out.println("\n\n name : " + component.getString("name"));
//
//
//
//			System.out.println("age : " + component.getString("age"));
//			System.out.println("colour : " + component.getString("colour"));
//			if(component.has("friendly"))
//				System.out.println("friendly : " +component.getString("friendly"));
//
//
//
////			if(str instanceof String)
////				System.out.println("friendly : " +component.getString("friendly"));
////else
////
////			System.out.println("null");
//
//		}

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


