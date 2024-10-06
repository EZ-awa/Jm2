package com.ez.jm2;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Jm2.MODID, name = Jm2.NAME, version = Jm2.VERSION)
public class Jm2 {
    public static final String MODID= "jm2";
    public static final String NAME= "Jm2";
    public static final String VERSION= "1.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        System.out.println(NAME + " is loading!");
    }

    @Mod.EventHandler
    public void init(FMLPreInitializationEvent event){
        System.out.println(NAME + " his loading!");
    }

    @Mod.EventHandler
    public void postInit(FMLPreInitializationEvent event){
        System.out.println(NAME + " 爆炸辣!");
    }
    //oioioi

}
