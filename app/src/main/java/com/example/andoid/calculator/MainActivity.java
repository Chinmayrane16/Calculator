package com.example.andoid.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    TextView textView;
    private Button clear, delete, percentage, divide, add, subtract, multiply, equal, minusValue;
    private  Button one, two, three, four, five, six, seven, eight, nine, point, zero ;

    private String ans="";
    ArrayList <Integer> a = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        





        //a.add(0);


        textView = (TextView)findViewById(R.id.textView1);
        //textView.setMovementMethod(new ScrollingMovementMethod());
        //textView.setSelected(true);
        clear = (Button)findViewById(R.id.buttonClearText);
        delete = (Button)findViewById(R.id.buttonDelete);
        percentage = (Button)findViewById(R.id.buttonPercentage);
        divide = (Button)findViewById(R.id.buttonDivide);
        add = (Button)findViewById(R.id.buttonAdd);
        subtract = (Button)findViewById(R.id.buttonSubtraction);
        multiply = (Button)findViewById(R.id.buttonMultiply);
        equal = (Button)findViewById(R.id.buttonEqual);
        minusValue = (Button)findViewById(R.id.buttonMinusValue);

        one = (Button)findViewById(R.id.button1);
        two = (Button)findViewById(R.id.button2);
        three = (Button)findViewById(R.id.button3);
        four = (Button)findViewById(R.id.button4);
        five = (Button)findViewById(R.id.button5);
        six = (Button)findViewById(R.id.button6);
        seven = (Button)findViewById(R.id.button7);
        eight = (Button)findViewById(R.id.button8);
        nine = (Button)findViewById(R.id.button9);
        point = (Button)findViewById(R.id.buttonPoint);
        zero = (Button)findViewById(R.id.buttonZero);



        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans+="1";
                textView.setText(textView.getText() + "1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans+="2";

                textView.setText(textView.getText() + "2");

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans+="3";

                textView.setText(textView.getText() + "3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans+="4";

                textView.setText(textView.getText() + "4");

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans+="5";

                textView.setText(textView.getText() + "5");

            }
        });


        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans+="6";

                textView.setText(textView.getText() + "6");

            }
        });


        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans+="7";

                textView.setText(textView.getText() + "7");

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans+="8";

                textView.setText(textView.getText() + "8");

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans+="9";

                textView.setText(textView.getText() + "9");

            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!textView.getText().toString().isEmpty())
                {
                    String s = textView.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    if(ch!='+' && ch!='-' && ch!='%' && ch!='*' && ch!='/' && ch!='.')
                    {
                        ans+=".";
                        textView.setText(textView.getText() + ".");
                    }

                }


            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans+="0";

                textView.setText(textView.getText() + "0");

            }
        });


        clear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                ans="";
                textView.setText(null);
                a.clear();
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!textView.getText().toString().isEmpty())
                {
                    String s = textView.getText().toString();
                    //ans=ans.substring(0,ans.length());
                    String s1="";
                    for(int i=0;i<s.length()-1;i++)
                    {
                        s1+=s.charAt(i);
                    }
                    //ans=ans.substring(0,s.length()-1);
                    ans=s1;
                    textView.setText(s1);
                }

            }
        });

        minusValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText().toString();
                double res = Double.parseDouble(s + "");
                res*=-1;
                ans=String.valueOf(res);
                textView.setText(res + "");
            }
        });

        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!textView.getText().toString().isEmpty())
                {
                    String s = textView.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    if(ch!='+' && ch!='-' && ch!='%' && ch!='*' && ch!='/' && ch!='.')
                    {
                        a.add(s.length()-1);
                        ans+="%";
                        textView.setText(textView.getText() + "%");
                    }


                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!textView.getText().toString().isEmpty())
                {
                    String s = textView.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    if(ch!='+' && ch!='-' && ch!='%' && ch!='*' && ch!='/' && ch!='.') {
                        a.add(s.length()-1);
                        ans+="/";
                        textView.setText(textView.getText() + "/");
                    }
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!textView.getText().toString().isEmpty())
                {
                    String s = textView.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    if(ch!='+' && ch!='-' && ch!='%' && ch!='*' && ch!='/' && ch!='.') {
                        a.add(s.length()-1);
                        ans+="+";
                        textView.setText(textView.getText() + "+");
                    }
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!textView.getText().toString().isEmpty())
                {
                    String s = textView.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    if(ch!='+' && ch!='-' && ch!='%' && ch!='*' && ch!='/' && ch!='.') {
                        a.add(s.length()-1);
                        ans+="-";
                        textView.setText(textView.getText() + "-");
                    }
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!textView.getText().toString().isEmpty())
                {
                    String s = textView.getText().toString();
                    char ch=s.charAt(s.length()-1);
                    if(ch!='+' && ch!='-' && ch!='%' && ch!='*' && ch!='/' && ch!='.') {
                        a.add(s.length()-1);
                        ans+="*";
                        textView.setText(textView.getText() + "*");
                    }


                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!textView.getText().toString().isEmpty())
                {
                    String s = ans;
                    char ch = s.charAt(s.length() - 1);
                    if (ch == '+' || ch == '-' || ch == '%' || ch == '*' || ch == '/' || ch=='.')
                    {
                        Toast.makeText(getApplicationContext(), "Invalid", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        a.add(s.length()-1);
                        s+= "=";
                        //String info="";

                        //boolean div=false,mult=false,sub=false,perc=false,add1=false;
                        double res=Double.parseDouble(s.substring(0,a.get(0)+1));

                        for(int i=0;i<a.size()-1;i++)
                        {
                            double answ = Double.parseDouble(s.substring(a.get(i)+2,a.get(i+1)+1));
                            if(s.charAt(a.get(i)+1)=='+')
                            {
                                res+=answ;
                            }
                            else if(s.charAt(a.get(i)+1)=='-')
                            {
                                res-=answ;
                            }
                            else if(s.charAt(a.get(i)+1)=='/')
                            {
                                res/=answ;
                            }
                            else if(s.charAt(a.get(i)+1)=='*')
                            {
                                res*=answ;
                            }
                            else if(s.charAt(a.get(i)+1)=='%')
                            {
                                res=(res)*(answ)/10000;
                            }
                        }

                        String answer = String.valueOf(res);
                        a.clear();


                        //int check=0; //first time
                        //String answ= String.valueOf(a.size());



                        textView.setText(answer );
                        //a.add(answer.length()-1);
                        ans=answer;
                    }


                }
            }
        });




    }
}





