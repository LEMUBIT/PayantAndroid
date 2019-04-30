# PayantAndroid

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/8d9c76bd609b45e9b873efe4f619cd9e)](https://app.codacy.com/app/LEMUBIT/PayantAndroid?utm_source=github.com&utm_medium=referral&utm_content=LEMUBIT/PayantAndroid&utm_campaign=badger)
[![Maintainability](https://api.codeclimate.com/v1/badges/9239daa9216d4e97f328/maintainability)](https://codeclimate.com/github/LEMUBIT/PayantAndroid/maintainability)
[![CircleCI](https://circleci.com/gh/LEMUBIT/PayantAndroid.svg?style=svg)](https://circleci.com/gh/LEMUBIT/PayantAndroid)
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)
[![](https://jitpack.io/v/LEMUBIT/PayantAndroid.svg)](https://jitpack.io/#LEMUBIT/PayantAndroid)

Payant Android can be used to access features on your [Payant](https://payant.ng/) account dashboard. 

For better understanding read the [Payant API documentation](https://developers.payant.ng/overview) before using this library.

Each of the major operations has a Manager Class in the PayantAndroid library, these managers are ***PayantClientManager***, ***PayantInvoiceManager***, ***PayantPaymentManager***, ***PayantWalletmanager***, ***PayantProductManager***. These Manager Classes perform all needed operations that are performed on your dashboard, for instance the *PayantClientManager* Class can ADD, GET, EDIT, and DELETE a Client. 

## How to use ##

0. **Add [JitPack](https://jitpack.io/) to your build file.**
```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```
1. **Add the Library dependency**

```
dependencies {
     implementation 'com.github.LEMUBIT:PayantAndroid:1.1.0'
}
```

2. **Ensure that your app has internet permissions by making sure the `uses-permission` line below is present in the AndroidManifest.xml.**
```xml
<uses-permission android:name="android.permission.INTERNET" />
```

3. **Initialize the SDK in `onCreate`**. 

The first argument is the `Application Context` while the second argument is a boolean value which is set to `true` when you are testing with a Live `private key` and set to `false` when you are using a Demo `private key`.

```java
  Payant.init(getApplicationContext(),true);
```

4. **Set the private key**. 

Private key should be set after initializing the SDK.

```java
   Payant.setPrivateKey("XXXXXXXXXXXX");
```

5. **Use Manager Classes**

Use the manager Class of the operation you want to perform. For instance perhaps you want to get the information of a Client with ID `166`, you would use the Client Manager's `getPayantClient()` method.

 ```java
     PayantClientManager.getPayantClient(166, new PayantClientManager.OnGetPayantClientListener() {
            @Override
            public void onManagerResponse(PayantClientInfo payantClientInfo) {
                Toast.makeText(MainActivity.this, payantClientInfo.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
```
In the sample above, the object `PayantClientInfo` contains the information of the Client whose info was requested. 



