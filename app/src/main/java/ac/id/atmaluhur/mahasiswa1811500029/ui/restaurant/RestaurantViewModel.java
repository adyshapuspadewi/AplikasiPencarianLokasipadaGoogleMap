package ac.id.atmaluhur.mahasiswa1811500029.ui.restaurant;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RestaurantViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RestaurantViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}