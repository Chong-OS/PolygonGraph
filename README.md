# PolygonGraph
[![License](http://img.shields.io/badge/license-MIT-green.svg?style=flat)]()
[![Download](https://api.bintray.com/packages/chongos/PolygonGraph/polygon-graph/images/download.svg) ](https://bintray.com/chongos/PolygonGraph/polygon-graph/_latestVersion)

![ScreenShot](https://raw.githubusercontent.com/Chong-OS/PolygonGraph/master/screenshot.png)

PolygonGraph widget for Android

## Requirements
- Android SDK 14+

## Usage
### Step 1:
Add this dependency in your project's build.gradle file which is in your app folder
```Groovy
dependencies {
	compile 'com.chongos:polygon-graph:1.0.0'
}
```
add this to your dependencies.

### Step 2:
Add `PolygonGraphView` to your xml layout

```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout
  xmlns:android="http://schemas.android.com/apk/res/android"
  xmlns:app="http://schemas.android.com/apk/res-auto"
  xmlns:tools="http://schemas.android.com/tools"
  android:layout_width="match_parent"
  android:layout_height="match_parent">

  <com.chongos.polygongraph.PolygonGraphView
    android:id="@+id/graph"
    android:layout_width="0dp"
    android:layout_height="0dp"
    app:animDuration="1000"
    app:fillColor="@color/fillColor"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintDimensionRatio="3:2"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toTopOf="parent"
    />

</android.support.constraint.ConstraintLayout>
```
### Step 3:
#### Initialize your view
```kotlin
val graph = findViewById(R.id.graph) as PolygonGraphView?
```
#### Pass the `ValueHolder` list to the `PolygonGraphView`
```kotlin
val values = listOf(
PolygonGraphView.ValueHolder(getString(R.string.str1), 0.8f, ContextCompat.getColor(context, R.color.color1)),
                PolygonGraphView.ValueHolder("Label2", 0.9f, ContextCompat.getColor(context, R.color.color2)),
		...
	)

val adapter = object : PolygonGraphView.Adapter<PolygonGraphView.ValueHolder>() {

	override fun getSize(): Int = values.size

        override fun onCreateValueHolder(pos: Int): PolygonGraphView.ValueHolder = values[pos]
}
        
graph?.setAdapter(adapter)

```

### Customize

| Params  | Description |
| ------------- | ------------- |
| `app:fillColor`  | To set the fill color.  |
| `app:axisColor`  | To change the color of axis.  |
| `app:axisSize`  | To set the size of axis (thickness).  |
| `app:dotSize`  | To set the size of dot.  |
| `app:dotPadding`  | To set padding size of dot.  |
| `app:labelSize`  | To set the color of label color.  |
| `app:labelPadding`  | To set padding size of label.  |
| `app:animDuration` | To set animation duration time in Milliseconds. |



## License

MIT License

Copyright (c) 2017 Chong-OS

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
