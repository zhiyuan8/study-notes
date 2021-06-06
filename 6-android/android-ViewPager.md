

PageAdapter
getCount(): Return the number of views available.  

instantiateItem(ViewGroup, int): Create the page for the given position. The adapter is responsible for adding the view to the container given here, although it only must ensure this is done by the time it returns from finishUpdate(ViewGroup).  

isViewFromObject(View, Object): Determines whether a page View is associated with a specific key object as returned by instantiateItem(ViewGroup, int). This method is required for a PagerAdapter to function properly.  

destroyItem(ViewGroup, int, Object): Remove a page for the given position. The adapter is responsible for removing the view from its container, although it only must ensure this is done by the time it returns from finishUpdate(ViewGroup).  

```
public class MyAdapter extends PagerAdapter {

    private List<View> mListView;

    public MyAdapter(List<View> myView){
        this.mListView = myView;
    }

    @Override
    public int getCount() {
        return mListView.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(mListView.get(position), 0);
        return super.instantiateItem(container, position);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(mListView.get(position));
    }
}
```



