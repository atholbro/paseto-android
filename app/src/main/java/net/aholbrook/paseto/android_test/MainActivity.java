package net.aholbrook.paseto.android_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import net.aholbrook.paseto.meta.android.PasetoBuilders;
import net.aholbrook.paseto.service.Token;
import net.aholbrook.paseto.service.TokenService;

import org.threeten.bp.Duration;
import org.threeten.bp.Instant;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {
	private TextView text;

	public static byte[] decode(String s) {
		int len = s.length();
		byte[] data = new byte[len/2];

		for(int i = 0; i < len; i+=2){
			data[i/2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i+1), 16));
		}

		return data;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		text = findViewById(R.id.text);

		final byte[] key = decode("707172737475767778797a7b7c7d7e7f808182838485868788898a8b8c8d8e8f");

		TokenService<Token> tokenService = PasetoBuilders.V2.localService(() -> key, Token.class).build();

		Token token = new Token();
		token.setExpiration(Instant.now().plus(Duration.ofDays(1)).getEpochSecond());
		token.setTokenId(UUID.randomUUID().toString());

		text.setText(tokenService.encode(token));
	}
}
