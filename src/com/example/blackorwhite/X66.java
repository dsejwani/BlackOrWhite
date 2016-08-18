package com.example.blackorwhite;

import com.example.blackorwhite.R;

import android.os.Build;
import android.os.Bundle;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class X66 extends Activity {
	int a=1,i,j,k,l,r,c,b=2,w=2,un=0,x,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x66);
    }
    Button B[][]=new Button[6][6];
    int A[][]=new int[6][6];
    int U[][]=new int[6][6];
    Button black,white;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        
        B[0][0]=(Button)findViewById(R.id.button00);
        B[0][1]=(Button)findViewById(R.id.Button01);
        B[0][2]=(Button)findViewById(R.id.Button02);
        B[0][3]=(Button)findViewById(R.id.Button03);
        B[0][4]=(Button)findViewById(R.id.Button04);
        B[0][5]=(Button)findViewById(R.id.Button05);
        B[1][0]=(Button)findViewById(R.id.Button10);
        B[1][1]=(Button)findViewById(R.id.Button11);
        B[1][2]=(Button)findViewById(R.id.Button12);
        B[1][3]=(Button)findViewById(R.id.Button13);
        B[1][4]=(Button)findViewById(R.id.Button14);
        B[1][5]=(Button)findViewById(R.id.Button15);
        B[2][0]=(Button)findViewById(R.id.Button20);
        B[2][1]=(Button)findViewById(R.id.Button21);
        B[2][2]=(Button)findViewById(R.id.Button22);
        B[2][3]=(Button)findViewById(R.id.Button23);
        B[2][4]=(Button)findViewById(R.id.Button24);
        B[2][5]=(Button)findViewById(R.id.Button25);
        B[3][0]=(Button)findViewById(R.id.Button30);
        B[3][1]=(Button)findViewById(R.id.Button31);
        B[3][2]=(Button)findViewById(R.id.Button32);
        B[3][3]=(Button)findViewById(R.id.Button33);
        B[3][4]=(Button)findViewById(R.id.Button34);
        B[3][5]=(Button)findViewById(R.id.Button35);
        B[4][0]=(Button)findViewById(R.id.Button40);
        B[4][1]=(Button)findViewById(R.id.Button41);
        B[4][2]=(Button)findViewById(R.id.Button42);
        B[4][3]=(Button)findViewById(R.id.Button43);
        B[4][4]=(Button)findViewById(R.id.Button44);
        B[4][5]=(Button)findViewById(R.id.Button45);
        B[5][0]=(Button)findViewById(R.id.Button50);
        B[5][1]=(Button)findViewById(R.id.Button51);
        B[5][2]=(Button)findViewById(R.id.Button52);
        B[5][3]=(Button)findViewById(R.id.Button53);
        B[5][4]=(Button)findViewById(R.id.Button54);
        B[5][5]=(Button)findViewById(R.id.Button55);
        white=(Button)findViewById(R.id.button1);
        black=(Button)findViewById(R.id.button2);
        for(i=0;i<6;i++)
         for(j=0;j<6;j++)
        	 A[i][j]=-1;
        A[2][2]=A[3][3]=0;
        A[2][3]=A[3][2]=1;

        return true;
    }
    public void sendMessage(View view) {
        // Do something in response to button click
    	final Animation vanish =AnimationUtils.loadAnimation(this,R.anim.vanish);
    	String s=getResources().getResourceEntryName(view.getId());
    	TextView result=(TextView)findViewById(R.id.textView1);
    	r=(int)s.charAt(6)-48;
    	c=(int)s.charAt(7)-48;
    	if(A[r][c]!=0 && A[r][c]!=1)
    	{
    		x=r;
    		y=c;
    		for(i=0;i<6;i++)
        		for(j=0;j<6;j++)
        			U[i][j]=0;
    		un=1;
    	if(a==1)
    	{
    		 view.setBackgroundColor(Color.BLACK);
    	        A[r][c]=1;
    	     
    	        b++;
        //up
        for(i=r-1;i>0 && A[i][c]==0;i--);
        if(i>=0 && A[i][c]==1)
        	for(k=r-1;k>i;k--)
        		{
        		B[k][c].setBackgroundColor(Color.BLACK);
        		B[k][c].startAnimation(vanish);
        		A[k][c]=1;
        		U[k][c]=1;
        		b++;
        		w--;
        		}
        
        //down
        for(i=r+1;i<5 && A[i][c]==0;i++);
        if(i<6 && A[i][c]==1)
        	for(k=r+1;k<i;k++)
        		{
        		
        		B[k][c].setBackgroundColor(Color.BLACK);
        		B[k][c].startAnimation(vanish);
        		A[k][c]=1;
        		U[k][c]=1;
        		b++;
        		w--;
        		}
        
        //left
        for(j=c-1;j>0 && A[r][j]==0;j--);
        if(j>=0 && A[r][j]==1)
        	for(l=c-1;l>j;l--)
        		{
        		
        		B[r][l].setBackgroundColor(Color.BLACK);
        		B[r][l].startAnimation(vanish);
        		A[r][l]=1;
        		U[r][l]=1;
        		b++;
        		w--;
        		}
        
        //right
        for(j=c+1;j<5 && A[r][j]==0;j++);
        if(j<6 && A[r][j]==1)
        	for(l=c+1;l<j;l++)
        		{
        		
        		B[r][l].setBackgroundColor(Color.BLACK);
        		B[r][l].startAnimation(vanish);
        		A[r][l]=1;
        		U[r][l]=1;
        		b++;
        		w--;
        		}
        
        //rightup
        for(i=r-1,j=c+1;i>0 && j<5 && A[i][j]==0;i--,j++);
        if(i>=0 && j<6 && A[i][j]==1)
        	for(k=r-1,l=c+1;k>i && l<j;k--,l++)
        	{
        		
        		B[k][l].setBackgroundColor(Color.BLACK);
        		B[k][l].startAnimation(vanish);
        		A[k][l]=1;
        		U[k][l]=1;
        		b++;
        		w--;
        	}
        
        //leftup
        for(i=r-1,j=c-1;i>0 && j>0 && A[i][j]==0;i--,j--);
        if(i>=0 && j>=0 && A[i][j]==1)
        	for(k=r-1,l=c-1;k>i && l>j;k--,l--)
        	{
        		
        		B[k][l].setBackgroundColor(Color.BLACK);
        		B[k][l].startAnimation(vanish);
        		A[k][l]=1;
        		U[k][l]=1;
        		b++;
        		w--;
        	}
        
        //rightdown
        for(i=r+1,j=c+1;i<5 && j<5 && A[i][j]==0;i++,j++);
        if(i<6 && j<6 && A[i][j]==1)
        	for(k=r+1,l=c+1;k<i && l<j;k++,l++)
        	{
        		
        		B[k][l].setBackgroundColor(Color.BLACK);
        		B[k][l].startAnimation(vanish);
        		A[k][l]=1;
        		U[k][l]=1;
        		b++;
        		w--;
        	}
        
        //leftdown
        for(i=r+1,j=c-1;i<5 && j>0 && A[i][j]==0;i++,j--);
        if(i<6 && j>=0 && A[i][j]==1)
        	for(k=r+1,l=c-1;k<i && l>j;k++,l--)
        	{
        		
        		B[k][l].setBackgroundColor(Color.BLACK);
        		B[k][l].startAnimation(vanish);
        		A[k][l]=1;
        		U[k][l]=1;
        		b++;
        		w--;
        	}
       
    	}
    	else
    		{
    		 view.setBackgroundColor(Color.WHITE);
     		A[r][c]=0;
     	
     		w++;
    		
            //up
            for(i=r-1;i>0 && A[i][c]==1;i--);
            if(i>=0 && A[i][c]==0)
            	for(k=r-1;k>i;k--)
            		{
            		
            		B[k][c].setBackgroundColor(Color.WHITE);
            		B[k][c].startAnimation(vanish);
            		A[k][c]=0;
            		U[k][c]=1;
            		w++;
            		b--;
            		}
            
            //down
            for(i=r+1;i<5 && A[i][c]==1;i++);
            if(i<6 && A[i][c]==0)
            	for(k=r+1;k<i;k++)
            		{
            		
            		B[k][c].setBackgroundColor(Color.WHITE);
            		B[k][c].startAnimation(vanish);
            		A[k][c]=0;
            		U[k][c]=1;
            		w++;
            		b--;
            		}
            
            //left
            for(j=c-1;j>0 && A[r][j]==1;j--);
            if(j>=0 && A[r][j]==0)
            	for(l=c-1;l>j;l--)
            		{
            		
            		B[r][l].setBackgroundColor(Color.WHITE);
            		B[r][l].startAnimation(vanish);
            		A[r][l]=0;
            		U[r][l]=1;
            		w++;
            		b--;
            		}
            
            //right
            for(j=c+1;j<5 && A[r][j]==1;j++);
            if(j<6 && A[r][j]==0)
            	for(l=c+1;l<j;l++)
            		{
            		
            		B[r][l].setBackgroundColor(Color.WHITE);
            		B[r][l].startAnimation(vanish);
            		A[r][l]=0;
            		U[r][l]=1;
            		w++;
            		b--;
            		}
            
            //rightup
            for(i=r-1,j=c+1;i>0 && j<5 && A[i][j]==1;i--,j++);
            if(i>=0 && j<6 && A[i][j]==0)
            	for(k=r-1,l=c+1;k>i && l<j;k--,l++)
            	{
            		
            		B[k][l].setBackgroundColor(Color.WHITE);
            		B[k][l].startAnimation(vanish);
            		A[k][l]=0;
            		U[k][l]=1;
            		w++;
            		b--;
            	}
            
            //leftup
            for(i=r-1,j=c-1;i>0 && j>0 && A[i][j]==1;i--,j--);
            if(i>=0 && j>=0 && A[i][j]==0)
            	for(k=r-1,l=c-1;k>i && l>j;k--,l--)
            	{
            		
            		B[k][l].setBackgroundColor(Color.WHITE);
            		B[k][l].startAnimation(vanish);
            		A[k][l]=0;
            		U[k][l]=1;
            		w++;
            		b--;
            	}
            
            //rightdown
            for(i=r+1,j=c+1;i<5 && j<5 && A[i][j]==1;i++,j++);
            if(i<6 && j<6 && A[i][j]==0)
            	for(k=r+1,l=c+1;k<i && l<j;k++,l++)
            	{
            		
            		B[k][l].setBackgroundColor(Color.WHITE);
            		B[k][l].startAnimation(vanish);
            		A[k][l]=0;
            		U[k][l]=1;
            		w++;
            		b--;
            	}
            
            //leftdown
            for(i=r+1,j=c-1;i<5 && j>0 && A[i][j]==1;i++,j--);
            if(i<6 && j>=0 && A[i][j]==0)
            	for(k=r+1,l=c-1;k<i && l>j;k++,l--)
            	{
            		
            		B[k][l].setBackgroundColor(Color.WHITE);
            		B[k][l].startAnimation(vanish);
            		A[k][l]=0;
            		U[k][l]=1;
            		w++;
            		b--;
            	}
           
    		}
    	black.setText(Integer.toString(b));
    	white.setText(Integer.toString(w));
    	if(b+w==36)
    	{
    		if(b>w)
    		{
    			result.setTextColor(Color.BLACK);
    	    	result.setText("Black wins");
    		}
    		else if(b<w)
    		{
    			result.setTextColor(Color.WHITE);
    			result.setText("White wins");
    		}
    		else
    		{
    			result.setTextColor(Color.GRAY);
    			result.setText("It's a tie");
    		}
    
    	}
    	a*=-1;
    	}
    }
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN) public void undo(View v)
    {
    	if(un==1)
    	{
    	for(i=0;i<6;i++)
    		for(j=0;j<6;j++)
    			if(U[i][j]==1)
    			{
    				if(A[i][j]==0)
    				{
    					A[i][j]=1;
    					B[i][j].setBackgroundColor(Color.BLACK);
    					b++;
    					w--;
    				}
    				else
    				{
    					A[i][j]=0;
    					B[i][j].setBackgroundColor(Color.WHITE);
    					w++;
    					b--;
    				}
    			}
    	if(A[x][y]==1)
    		b--;
    	else if(A[x][y]==0)
    		w--;
    	A[x][y]=-1;
    	B[x][y].setBackground(this.getResources().getDrawable(R.drawable.button_green));
		black.setText(Integer.toString(b));
    	white.setText(Integer.toString(w));
    	un=0;
    	a*=-1;
    	}
    }
    
}


