package wisniewski.pum.boardgamesscores;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends FragmentActivity{

    FragmentManager fm = getSupportFragmentManager();
    MainMenuFragment mainMenuFragment;
    NewGameFragment newGameFragment;
    NewTemplateFragment newTemplateFragment;
    CreateNewTemplateFragment createNewTemplateFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainMenuFragment = MainMenuFragment.newInstance();
        newGameFragment = NewGameFragment.newInstance();
        newTemplateFragment = NewTemplateFragment.newInstance();
        createNewTemplateFragment = CreateNewTemplateFragment.newInstance();

        // dodanie fragmentu MainMenuFragment
        if(savedInstanceState == null) {
            fm.beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, mainMenuFragment, null)
                    .setCustomAnimations(
                            R.anim.slide_in,  // enter
                            R.anim.fade_out,  // exit
                            R.anim.fade_in,   // popEnter
                            R.anim.slide_out  // popExit
                    )
                    .addToBackStack("mainMenu")
                    .commit();
        }
    }

    // Przełącza widok na fragment NewGameFragment z odpowiednimi efektami
    public void newGame(View view) {
        fm.beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragment_container_view, newGameFragment)
                .setCustomAnimations(
                        R.anim.slide_in,  // enter
                        R.anim.fade_out,  // exit
                        R.anim.fade_in,   // popEnter
                        R.anim.slide_out  // popExit
                )
                .addToBackStack("newGame")
                .commit();
    }

    // Przełącza widok na fragment NewTemplateFragment z odpowiednimi efektami
    public void newTemplate(View view) {
        fm.beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragment_container_view, newTemplateFragment)
                .setCustomAnimations(
                        R.anim.slide_in,  // enter
                        R.anim.fade_out,  // exit
                        R.anim.fade_in,   // popEnter
                        R.anim.slide_out  // popExit
                )
                .addToBackStack("newTemplate")
                .commit();
    }

    // Przełącza widok na fragment CreateNewTemplateFragment z odpowiednimi efektami
    public void CreateNewTemplate(View view) {
        fm.beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragment_container_view, createNewTemplateFragment)
                .setCustomAnimations(
                        R.anim.slide_in,  // enter
                        R.anim.fade_out,  // exit
                        R.anim.fade_in,   // popEnter
                        R.anim.slide_out  // popExit
                )
                .addToBackStack("newTemplate")
                .commit();
    }

    // Zapisuje tablicę utworzoną przez użytkownika jako template
    public void SaveTemplate(View view) {
    }

    // Edytuje tablicę tworzoną przez użytkownika
    public void EditTemplate(View view) {
    }
}