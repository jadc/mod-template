package red.jad.template;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

public class Template implements ModInitializer, ClientModInitializer {
	@Override
	public void onInitialize() {
		System.out.println("Hello!");
	}

    @Environment(EnvType.CLIENT)
	@Override
	public void onInitializeClient(){

    }
}
