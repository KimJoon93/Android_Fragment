# Android_Fragment
## Codelab developed by the Google Devleopers Training Team

### What is Fragment?
A Fragment is a self-contained component with its own user interface (UI) and lifecycle that can be reused in different parts of an app's UI. (A Fragment can also be used without a UI, in order to retain values across configuration changes, but this lesson does not cover that usage.)

### 1. Start Project

- Downlaod Starter code from git. [FragmentExample_start](https://github.com/google-developer-training/android-advanced-starter-apps/tree/master/FragmentExample_start)

![image](https://user-images.githubusercontent.com/32008149/61992207-47efed80-b096-11e9-9a73-64a77d7edbfd.png)

### 2. Add a Fragment

- Add Blank Fragment, and notice that you should decheckify 2 Check box because we don't need this time. (Or you will get longer code that doesn't need.)
![image](https://user-images.githubusercontent.com/32008149/61992252-aae18480-b096-11e9-9035-7dcc079705dc.png)

- Open SimpleFragment and inspect the code.
    ```
    public class SimpleFragment extends Fragment {

    public SimpleFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, 
                 ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_simple, 
                 container, false);
    ```

### 3. Edit the FragmentLayout
- Open fragment_simple.xml and Add this code.
    ```
    <?xml version="1.0" encoding="utf-8"?>
        <LinearLayout xmlns:android="http://schemas.android.com apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/my_fragment_color"
        android:orientation="horizontal"
        tools:context=".SimpleFragment">

    <TextView
        android:id="@+id/fragment_header"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textAppearance="@style/TextAppearance.AppCompat.Medium"
        android:padding="4dp"
        android:text="@string/question_article" />

        <RadioGroup
            android:id="@+id/radio_group"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <RadioButton
                android:id="@+id/radio_button_yes"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginRight="8dp"
                android:text="@string/yes" />

            <RadioButton
                android:id="@+id/radio_button_no"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginRight="8dp"
                android:text="@string/no" />
        </RadioGroup>

    </LinearLayout>
    ```

- Image should look like this
![image](https://user-images.githubusercontent.com/32008149/61992369-4b847400-b098-11e9-9f1d-aeda07868ec8.png)

### 4. Add a Listner for Radio Btn

- Open SimpleFragment.java and Add this code.

- 

### 5. Add the Fragment Statically to the Activity
- Open activity_main.xml and Add this code below the ScrollView.
    ```
    <fragment
        android:id="@+id/fragment"
        android:name="com.example.android.fragmentexample.SimpleFragment"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        tools:layout="@layout/fragment_simple" />
    ```

 - If we run the app, App will look like this.
    ![image](https://user-images.githubusercontent.com/32008149/61992413-0a409400-b099-11e9-9d7c-39cd396c4267.png)

   