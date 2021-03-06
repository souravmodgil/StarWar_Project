package com.starwar.databinding;
import com.starwar.R;
import com.starwar.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCharacterBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    public final android.widget.Button btTryAgain;
    @NonNull
    public final android.support.v7.widget.RecyclerView listUser;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    public final android.widget.ProgressBar progressBar;
    // variables
    @Nullable
    private com.starwar.viewModel.CharacterViewModel mCharacterViewModel;
    // values
    // listeners
    private OnClickListenerImpl mCharacterViewModelOnItemClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityCharacterBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.btTryAgain = (android.widget.Button) bindings[2];
        this.btTryAgain.setTag(null);
        this.listUser = (android.support.v7.widget.RecyclerView) bindings[3];
        this.listUser.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar = (android.widget.ProgressBar) bindings[1];
        this.progressBar.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.characterViewModel == variableId) {
            setCharacterViewModel((com.starwar.viewModel.CharacterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCharacterViewModel(@Nullable com.starwar.viewModel.CharacterViewModel CharacterViewModel) {
        this.mCharacterViewModel = CharacterViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.characterViewModel);
        super.requestRebind();
    }
    @Nullable
    public com.starwar.viewModel.CharacterViewModel getCharacterViewModel() {
        return mCharacterViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCharacterViewModelProgressBar((android.databinding.ObservableInt) object, fieldId);
            case 1 :
                return onChangeCharacterViewModelUserRecycler((android.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeCharacterViewModelUserLabel((android.databinding.ObservableInt) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCharacterViewModelProgressBar(android.databinding.ObservableInt CharacterViewModelProgressBar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCharacterViewModelUserRecycler(android.databinding.ObservableInt CharacterViewModelUserRecycler, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCharacterViewModelUserLabel(android.databinding.ObservableInt CharacterViewModelUserLabel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int characterViewModelProgressBarGet = 0;
        android.databinding.ObservableInt characterViewModelProgressBar = null;
        android.databinding.ObservableInt characterViewModelUserRecycler = null;
        com.starwar.viewModel.CharacterViewModel characterViewModel = mCharacterViewModel;
        int characterViewModelUserRecyclerGet = 0;
        android.databinding.ObservableInt characterViewModelUserLabel = null;
        android.view.View.OnClickListener characterViewModelOnItemClickAndroidViewViewOnClickListener = null;
        int characterViewModelUserLabelGet = 0;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (characterViewModel != null) {
                        // read characterViewModel.progressBar
                        characterViewModelProgressBar = characterViewModel.progressBar;
                    }
                    updateRegistration(0, characterViewModelProgressBar);


                    if (characterViewModelProgressBar != null) {
                        // read characterViewModel.progressBar.get()
                        characterViewModelProgressBarGet = characterViewModelProgressBar.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (characterViewModel != null) {
                        // read characterViewModel.userRecycler
                        characterViewModelUserRecycler = characterViewModel.userRecycler;
                    }
                    updateRegistration(1, characterViewModelUserRecycler);


                    if (characterViewModelUserRecycler != null) {
                        // read characterViewModel.userRecycler.get()
                        characterViewModelUserRecyclerGet = characterViewModelUserRecycler.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (characterViewModel != null) {
                        // read characterViewModel.userLabel
                        characterViewModelUserLabel = characterViewModel.userLabel;
                    }
                    updateRegistration(2, characterViewModelUserLabel);


                    if (characterViewModelUserLabel != null) {
                        // read characterViewModel.userLabel.get()
                        characterViewModelUserLabelGet = characterViewModelUserLabel.get();
                    }
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (characterViewModel != null) {
                        // read characterViewModel::onItemClick
                        characterViewModelOnItemClickAndroidViewViewOnClickListener = (((mCharacterViewModelOnItemClickAndroidViewViewOnClickListener == null) ? (mCharacterViewModelOnItemClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mCharacterViewModelOnItemClickAndroidViewViewOnClickListener).setValue(characterViewModel));
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.btTryAgain.setOnClickListener(characterViewModelOnItemClickAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.btTryAgain.setVisibility(characterViewModelUserLabelGet);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.listUser.setVisibility(characterViewModelUserRecyclerGet);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.progressBar.setVisibility(characterViewModelProgressBarGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.starwar.viewModel.CharacterViewModel value;
        public OnClickListenerImpl setValue(com.starwar.viewModel.CharacterViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onItemClick(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityCharacterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityCharacterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityCharacterBinding>inflate(inflater, com.starwar.R.layout.activity_character, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityCharacterBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityCharacterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.starwar.R.layout.activity_character, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityCharacterBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityCharacterBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_character_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityCharacterBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): characterViewModel.progressBar
        flag 1 (0x2L): characterViewModel.userRecycler
        flag 2 (0x3L): characterViewModel.userLabel
        flag 3 (0x4L): characterViewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}