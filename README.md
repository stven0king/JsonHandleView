# JsonHandleView
It's like json-handle, to convert json strings to a friendly readable format, it supports expend&amp;collapsed json strings.

https://chrome.google.com/webstore/detail/json-handle/iahnhfdhidomcpggpaimmmahffihkfnj

<img src="https://github.com/stven0king/JsonHandleView/blob/master/screenshots/json-handle.png?raw=true" width="270"/>

<img src="https://github.com/stven0king/JsonHandleView/blob/master/screenshots/json-handle.gif?raw=true" width="270"/>

## Dependencies

```java
implementation 'com.tzx.json:jsonhandleview:1.0.0'
```

## Usage

**Step1**

```xml
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fillViewport="true"
    android:orientation="vertical">

    <com.dandan.jsonhandleview.library.JsonViewLayout
        android:id="@+id/jsonView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

</FrameLayout>
```

**step2**

```java
JsonViewLayout jsonViewLayout = findViewById(R.id.jsonView);
jsonViewLayout.bindJson("your json strings." || JSONObject || JSONArray);
```

## Code Style

The default code style is like [JSON-handle](https://chrome.google.com/webstore/detail/json-handle/iahnhfdhidomcpggpaimmmahffihkfnj).

```java
// Color
jsonViewLayout.setKeyColor()
jsonViewLayout.setObjectKeyColor()
jsonViewLayout.setValueTextColor()
jsonViewLayout.setValueNumberColor()
jsonViewLayout.setValueNullColor()
jsonViewLayout.setValueBooleanColor()
jsonViewLayout.setArrayLengthColor()

// TextSize
jsonViewLayout.setTextSize()
```

## LICENSE

```lis
Copyright 2018 stven0king, All right reserved.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```

