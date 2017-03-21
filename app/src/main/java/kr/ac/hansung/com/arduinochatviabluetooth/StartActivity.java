package kr.ac.hansung.com.arduinochatviabluetooth;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    private Button connectBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        setContentView(R.layout.activity_start);

        connectBtn = (Button)findViewById(R.id.connect_btn);
        connectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* 1. 내 블루투스 켜기
                 * - On인 경우 다음단계로
                 * - Off인 경우 블루투스 On */

                /* 2-1. 다른 블루투스 검색 */

                /* 2-2. 98:D3:31:40:69:CC 선택
                 * - 98:D3:31:40:69:CC와 연결 실패시 사용자에게 토스트메시지
                 * - 98:D3:31:40:69:CC와 연결 성공시 다음 단계로 */

                /* 3. 98:D3:31:40:69:CC와 페어링
                 * - 98:D3:31:40:69:CC와 페어링 실패시 사용자에게 토스트메시지
                 * - 98:D3:31:40:69:CC와 페어링 성공시 다음 단계로 */

                /* 4. 98:D3:31:40:69:CC와 연결
                 * - 98:D3:31:40:69:CC와 연결 실패시 사용자에게 토스트메시지
                 * - 98:D3:31:40:69:CC와 연결 성공시 다음 단계로 */

                /* 5. 98:D3:31:40:69:CC에서 데이터 수신
                 * 사용자 이용시 담배를 피었을때 발생한 시간 데이터 */

                /* 6. 98:D3:31:40:69:CC에서 받아온 데이터를 웹으로 전송 (웹 연동 단계에 따라 태스크를 나눠야 할 듯)
                 * - 웹 연결 실패시 사용자에게 토스트메시지
                 * - 웹 연결 성공시 다음 단계로 */

                /* 7. 위 단계 완료 시 액티비티 이동 */
            }
        });
    }
}
