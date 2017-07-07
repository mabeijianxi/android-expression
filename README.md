# android-expression
这是一个 Android 自定义表情库

### 效果图
<img src="https://github.com/mabeijianxi/android-expression/blob/master/expression.gif"  alt="expression.gif" />

### 文章详解
[快速打造 Android 自定义表情库](http://blog.csdn.net/mabeijianxi/article/details/74779611)
### 使用方法
1. 添加依赖：
    compile 'com.mabeijianxi:jianxiexpression:2.2.8'
2. 在需要使用表情输入的地方使用 ExpressionEditText 这个 View,并且在相应位置实现 ExpressionGridFragment.ExpressionClickListener,ExpressionGridFragment.ExpressionDeleteClickListener 。实现内容如下：
```
@Override
    public void expressionDeleteClick(View v) {
        ExpressionShowFragment.delete(et_send_content);
    }

    /**
     * 这里必须实现表情点击后才能把具体表情传入edittext
     * @param str
     */
    @Override
    public void expressionClick(String str) {
        ExpressionShowFragment.input(et_send_content, str);
    }
```
3. 在想显示表情的键盘的位置用一个 FrameLayout 填充，然后在需要显示表情键盘的时候如下操作：
```
getSupportFragmentManager().beginTransaction().replace(R.id.fl_emogi, ExpressionShowFragment.newInstance()).commit();
```
4. 在你需要展示而非输入的地方使用 ExpressionTextView 。

### 注意事项
如果你需要对 ExpressionTextView 再设置其他 Spannable ，设置完不要直接调用 setText ，你需要调用 setSpannableString 这个方法才不会不覆盖。


### 更新日志
#### 2017.07.07
    提交 2.2.8


