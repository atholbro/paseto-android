package net.aholbrook.paseto.crypto.v2.libsodium.android;

import com.goterl.lazycode.lazysodium.LazySodiumAndroid;
import com.goterl.lazycode.lazysodium.SodiumAndroid;

import net.aholbrook.paseto.crypto.v2.libsodium.LibSodiumV2CryptoProvider;

public class AndroidLibSodiumV2CryptoProvider extends LibSodiumV2CryptoProvider {
	public AndroidLibSodiumV2CryptoProvider() {
		super(new SodiumAndroid());
	}

	public AndroidLibSodiumV2CryptoProvider(LazySodiumAndroid sodium) {
		super(sodium.getSodium());
	}
}
