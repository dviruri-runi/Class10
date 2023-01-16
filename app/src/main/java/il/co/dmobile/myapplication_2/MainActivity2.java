package il.co.dmobile.myapplication_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras();
        User user = (User) b.getSerializable("User");

        ImageView avatar = findViewById(R.id.avatar);
        TextView name = findViewById(R.id.name);
        TextView email = findViewById(R.id.email);

        avatar.setImageResource(user.getImage());
        name.setText(user.getName());
        email.setText(user.getEmail());

    }
}