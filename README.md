# PolygonGraph
PolygonGraph widget for Android

[![License](http://img.shields.io/badge/license-MIT-green.svg?style=flat)]()
[![Download](https://api.bintray.com/packages/chongos/PolygonGraph/polygon-graph/images/download.svg) ](https://bintray.com/chongos/PolygonGraph/polygon-graph/_latestVersion)

## Requirements
- Android SDK 16+

## Usage

Add the dependency:
```Groovy
dependencies {
	compile 'com.chongos:polygon-graph:1.0.0'
}
```
```
## to use this library

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
