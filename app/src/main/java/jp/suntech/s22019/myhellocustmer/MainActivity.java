package jp.suntech.s22019.myhellocustmer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 表示ボタンであるButtonオブジェクトを取得。
        Button btClick = findViewById(R.id.btConfirm);
        // リスナクラスのインスタンスを作成。
        HelloListener Listener = new HelloListener();
        // 表示ボタンにリスナを設定。
        btClick.setOnClickListener(Listener);

        // クリアボタンであるButtonオブジェクトを取得。
        Button btClear = findViewById(R.id.btClear);
        // クリアボタンにリスナを設定。
        btClear.setOnClickListener(Listener);
        // クリアボタンであるButtonオブジェクトを取得。
        Button ctClear = findViewById(R.id.ctClear);
        // クリアボタンにリスナを設定。
        ctClear.setOnClickListener(Listener);
    }

    // ボタンをクリックした時のリスナクラス
    private class HelloListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            // 名前入力欄であるEditTextオブジェクトを取得。
            EditText input = findViewById(R.id.etName);
            // 名前入力欄であるEditTextオブジェクトを取得。
            EditText inputn = findViewById(R.id.editTextTextMultiLine);
            // メッセージを表示するTextViewオブジェクトを取得。
            TextView output = findViewById(R.id.tvOutput);

            // タップされた画面部分のidのR値を取得
            int id = view.getId();
            // idのR値に応じて処理を分岐
            if (id == R.id.btConfirm) {
                String inputStr = inputn.getText().toString();
                String name = input.getText().toString();
                output.setText(inputStr + "にお住いの " + name + " さん、こんにちは！");
            } else if (id == R.id.ctClear) {
                input.setText("");
                output.setText("");
            } else if (id == R.id.btClear) {
                inputn.setText("");
                output.setText("");
            }
        }
    }
}