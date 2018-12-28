package com.mygdx.game;

import java.util.ArrayList;

public class Pets {



   public int age;
   public String name;
   public String colour;
   public boolean friendly;

   public Pets(String  name,int age, String colour, boolean friendly) {
      this.age = age;
      this.name = name;
      this.colour = colour;
      this.friendly = friendly;
   }

   public Pets() {
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getColour() {
      return colour;
   }

   public void setColour(String colour) {
      this.colour = colour;
   }

   public boolean isFriendly() {
      return friendly;
   }

   public void setFriendly(boolean friendly) {
      this.friendly = friendly;
   }


}