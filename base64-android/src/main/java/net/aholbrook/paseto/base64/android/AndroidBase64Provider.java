package net.aholbrook.paseto.base64.android;

import android.util.Base64;

import net.aholbrook.paseto.base64.Base64Provider;

public class AndroidBase64Provider implements Base64Provider {
	@Override
	public String encodeToString(byte[] bytes) {
		return Base64.encodeToString(bytes, Base64.URL_SAFE | Base64.NO_PADDING | Base64.NO_WRAP);
	}

	@Override
	public byte[] decodeFromString(String s) {
		return Base64.decode(s, Base64.URL_SAFE);
	}
}
