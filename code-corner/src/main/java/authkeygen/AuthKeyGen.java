package authkeygen;

import java.sql.Timestamp;

/**
 * Created by epcm on 2017/8/29.
 */
public class AuthKeyGen {



    public String getAuthKey(String client_id, String client_secret) {

        Timestamp now = new Timestamp(System.currentTimeMillis());

        String authInfo_plain = client_id + client_secret + "AT" + now.getTime();

        String authInfo_md5 = SimpleMD5.getMD5(authInfo_plain, 16);

        return authInfo_md5 + "." + now.getTime() ;
    }





    public static void main(String[] args) {
        // TODO �Զ����ɵķ������

        String appKey  = "3466927A3BE24B398C0D4E9AE9B66C14";
        System.out.println("MSP-AppKey : " + appKey);

        String client_id = "E682F8D631C84C45AA0A0A9B4526395E";
        String client_secret = "D35A4A550D53448EB72FD71BF78820AA";


        AuthKeyGen akg = new AuthKeyGen();
        String authKey = akg.getAuthKey(client_id ,client_secret);

        System.out.println("MSP-AuthKey: " + authKey);
    }


}