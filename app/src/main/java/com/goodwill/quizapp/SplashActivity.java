package com.goodwill.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;

public class SplashActivity extends AppCompatActivity {

    public static ArrayList<modelclass> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=new ArrayList<>();
        list.add(new modelclass("awsasas","a","b","c","d","ans"));

        list.add(new modelclass("For which of the following disciplines is Nobel Prize awarded?","Physics and Chemistry","Physiology or Medicine","Literature, Peace and Economics","All of the above","All of the above"));

        list.add(new modelclass("Entomology is the science that studies..","Behavior of human beings","Insects","The origin and history of technical and scientific terms","The formation of rocks","Insects"));

        list.add(new modelclass("Hitler party which came into power in 1933 is known as..","Labour Party","Nazi Party","Ku-Klux-Klan","Democratic Party","Nazi Party"));

        list.add(new modelclass("Gulf cooperation council was originally formed by","Bahrain, Kuwait, Oman, Qatar, Saudi Arabia and United Arab Emirates","Second World Nations","Third World Nations","Fourth World Nations","Bahrain, Kuwait, Oman, Qatar, Saudi Arabia and United Arab Emirates"));

        list.add(new modelclass("Friction can be reduced by changing from..","sliding to rolling","rolling to sliding","potential energy to kinetic energy","dynamic to static","sliding to rolling"));

        list.add(new modelclass("Fire temple is the place of worship of which of the following religion?","Taoism","Judaism","Zoroastrianism (Parsi Religion)","Shintoism","Zoroastrianism (Parsi Religion)"));

        list.add(new modelclass("The ozone layer restricts..","Visible light","	Infrared radiation","X-rays and gamma rays","Ultraviolet radiation","Ultraviolet radiation"));

        list.add(new modelclass("Eugenics is the study of..","altering human beings by changing their genetic components","people of European origin","different races of mankind","genetic of plants","altering human beings by changing their genetic components"));

        list.add(new modelclass("Euclid was..","Greek mathematician","Contributor to the use of deductive principles of logic as the basis of geometry","Propounded the geometrical theorems","All of the above","All of the above"));

        list.add(new modelclass("Ecology deals with..","Birds","Cell formation","Relation between organisms and their environment","Tissues","Relation between organisms and their environment"));

        list.add(new modelclass("Filaria is caused by..","Bacteria","Mosquito","Protozoa","Virus","Mosquito"));

        list.add(new modelclass("Headquarters of UNO are situated at..","New York","Hague (Netherlands)","Geneva","Paris","New York"));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,DashboardActivity.class);
                startActivity(intent);

            }
        },1500);
    }
}