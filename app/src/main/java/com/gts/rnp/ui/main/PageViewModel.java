package com.gts.rnp.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {
    private int content_i = 1;
    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
            return "http://dmzspytour.co.kr/webcontents/content.php?param="+content_i+"-"+input+".png";
                    //content_i+"" + input;
        }
    });

    public void setIndex(int index, int content_i) {
        mIndex.setValue(index);
        this.content_i = content_i;
    }

    public LiveData<String> getText() {
        return mText;
    }
}