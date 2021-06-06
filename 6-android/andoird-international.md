# Android LayoutParams & dp
px: pixel, same length in different resolutions.  
pt: point, same length in different resolutions.  

What we actually use in xml file:
dp  : device independent pixel.  
dip : same as dp.   
sp  : scaled pixel, for fontsize.  

LayoutParams: LayoutParams are used by views to tell their parents how they want to be laid out, at least I need to provide width and height.  
Use 'setLayoutParams' or 'addView'.  

```
        LinearLayout linearLayout = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        linearLayout.setLayoutParams(layoutParams);

        TextView textView = new TextView(this);
        textView.setText("我是文本");
        LinearLayout.LayoutParams textParams = new LinearLayout.LayoutParams(200, 100);
        linearLayout.addView(textView,textParams);

        setContentView(linearLayout);
```
