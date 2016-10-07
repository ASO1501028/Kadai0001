package jp.ac.asojuku.st.kadai001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnClickActivity extends AppCompatActivity
implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_on_click);
        Button btnBack = (Button) this.findViewById(R.id.btnBack01);
        btnBack.setOnClickListener(this);
    }

    @Override
    protected void onResume(){
        super.onResume();

        // 前の画面からのインテントを取得
        Intent preIntent = getIntent();
        // 選択肢を表すキーワードを文字列定義リソースから取得
        String keyword = getResources().getString(R.string.usersOption);
        // 選択された文字列をキーワードを元に取得

        // 正解を文字列定義リソースから取得
        String correctWord = getResources().getString(R.string.usagi);

        // テキストビューの表示はデフォルトは不正解にしてあるので、正解時に表示を変更


    }

    // 戻るボタンの動作
    @Override
    public void onClick(View v) {

    }
}
