package door.one.marketplace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import door.one.marketplace.Fragments.CartFragment;
import door.one.marketplace.Fragments.HomeFragment;
import door.one.marketplace.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ///Last change 08.01.2023///
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Fragments(new HomeFragment());
        binding.bottomHome.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    Fragments(new HomeFragment());
                    break;
                case R.id.cart:
                    Fragments(new CartFragment());
                    break;
            }
            return true;
        });

    }
    private void Fragments(Fragment fragment){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame,fragment);
        fragmentTransaction.commit();
    }

}
