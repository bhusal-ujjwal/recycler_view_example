package com.example.recycler_view_example_usa_president_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    List<Presidents> lstPresidents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstPresidents= new ArrayList<>();
        lstPresidents.add(new Presidents("Barack Obama","Barack Obama(born August 4, 1961) is an American Politician and served as the 44   44th president of USA from 2009-2017. A member of the Democratic Party, he was the first African American to be elected to the presidency. He previously served as a U.S. senator from Illinois from 2005 to 2008 and an Illinois state senator from 1997 to 2004. ", R.drawable.obama));
        lstPresidents.add(new Presidents("Donald Trump","Donald Trump(born  June 14, 1946) is an American Politician and serves as the 45th president of USA. Before entering politics, he was a businessman and television personality.Trump entered the 2016 presidential race as a Republican and defeated 16 other candidates in the primaries. ", R.drawable.donald));
        lstPresidents.add(new Presidents("Bill Clinton", "Bill Clinton(born August 19, 1946) is an American Politician and served as the 42nd president of USA from 1993-2001. August 19, 1946", R.drawable.bill));
        lstPresidents.add(new Presidents("Jimmy Carter","Jimmy Carter(born  October 1, 1924) is an American Politician and served as the 39th president of USA from 1977-1981.Since leaving the presidency, Carter has remained active in the private sector; in 2002, he was awarded the Nobel Peace Prize for his work in co-founding the Carter Center. ", R.drawable.jimmy));
        lstPresidents.add(new Presidents("John F. Kennedy","John F. Kennedy(born May 29, 1917 – November 22, 1963) was an American Politician and served as the 35th president of USA from 1961-1963.Kennedy served at the height of the Cold War, and the majority of his work as president dealt with managing relations with the Soviet Union and Cuba. A Democrat, Kennedy represented Massachusetts in the U.S. House of Representatives and Senate prior to becoming president. ", R.drawable.kennedy));
        lstPresidents.add(new Presidents("Lyndon B. Johnson","Lyndon B. Johnson(born  August 27, 1908 – January 22, 1973) was an American Politician and served as the 36th president of USA from 1963-1969. A Democrat from Texas, Johnson also served as a United States Representative and as the Majority Leader in the United States Senate. Johnson is one of only four people who have served in all four federal elected positions.", R.drawable.lyndon));
        lstPresidents.add(new Presidents("Richard Nixon","Richard Nixon(born January 9, 1913 – April 22, 1994) was an American Politician and served as the 37th president of USA from 1969-1974.The only president to resign from the office, he previously served as the nation's 36th vice president from 1953 to 1961, and as a representative and senator from California. ", R.drawable.richard));
        lstPresidents.add(new Presidents("Gerald Ford","Gerald Ford(born July 14, 1913 – December 26, 2006) was an American Politician and served as the 38th president of USA from 1974-1977.Ford is the only person to have served as both vice president and president without being elected to either office by the Electoral College. ", R.drawable.gerald));
        lstPresidents.add(new Presidents("Ronald Reagan","Ronald Reagan(born February 6, 1911 – June 5, 2004) was an American Politician and served as the 40th president of USA from 1981-1989.Prior to his presidency, he was a Hollywood actor and union leader before serving as the 33rd governor of California from 1967 to 1975. ", R.drawable.ronald));
        lstPresidents.add(new Presidents("George W. Bush","George W. Bush(born  July 6, 1946) is an American Politician and served as the 43rd president of USA from 2001-2009.Bush was elected President of the United States in 2000 when he defeated Democratic incumbent Vice President Al Gore after a narrow and contested win that involved a stopped recount in Florida.", R.drawable.george));


        RecyclerView myrv= (RecyclerView) findViewById(R.id. recyclerView);
        RecyclerViewAdapter myAdapter= new RecyclerViewAdapter(this,lstPresidents);
        myrv.setLayoutManager( new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);

    }
}
