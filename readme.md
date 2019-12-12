# 声明周期
##### 打开程序：
- 2019-12-12 11:43:47.893 D/MainActivity: ========== onCreate ==========
- 2019-12-12 11:43:47.909 D/MainActivity: ========== onStart ==========
- 2019-12-12 11:43:47.914 D/MainActivity: ========== onResume ==========
##### 初次打开Normal：
- 2019-12-12 11:44:12.375 D/MainActivity: ========== onPause ==========
- 2019-12-12 11:44:12.487 D/NormalActivity: ========== onCreate ==========
- 2019-12-12 11:44:12.503 D/NormalActivity: ========== onStart ==========
- 2019-12-12 11:44:12.506 D/NormalActivity: ========== onResume ==========
- 2019-12-12 11:44:13.146 D/MainActivity: ========== onStop ==========
##### Normal返回Main：
- 2019-12-12 11:44:43.124 D/NormalActivity: ========== onPause ==========
- 2019-12-12 11:44:43.152 D/MainActivity: ========== onRestart ==========
- 2019-12-12 11:44:43.153 D/MainActivity: ========== onStart ==========
- 2019-12-12 11:44:43.155 D/MainActivity: ========== onResume ==========
- 2019-12-12 11:44:43.823 D/NormalActivity: ========== onStop ==========
- 2019-12-12 11:44:43.826 D/NormalActivity: ========== onDestroy ==========
##### 再次打开Normal：
- 2019-12-12 11:45:14.054 D/MainActivity: ========== onPause ==========
- 2019-12-12 11:45:14.177 D/NormalActivity: ========== onCreate ==========
- 2019-12-12 11:45:14.191 D/NormalActivity: ========== onStart ==========
- 2019-12-12 11:45:14.194 D/NormalActivity: ========== onResume ==========
- 2019-12-12 11:45:14.868 D/MainActivity: ========== onStop ==========
##### Normal返回Main：
- 2019-12-12 11:45:36.280 D/NormalActivity: ========== onPause ==========
- 2019-12-12 11:45:36.305 D/MainActivity: ========== onRestart ==========
- 2019-12-12 11:45:36.307 D/MainActivity: ========== onStart ==========
- 2019-12-12 11:45:36.309 D/MainActivity: ========== onResume ==========
- 2019-12-12 11:45:36.919 D/NormalActivity: ========== onStop ==========
- 2019-12-12 11:45:36.923 D/NormalActivity: ========== onDestroy ==========
##### 初次打开Dialog：
- 2019-12-12 11:46:01.794 D/MainActivity: ========== onPause ==========
- 2019-12-12 11:46:01.905 D/DialogActivity: ========== onCreate ==========
- 2019-12-12 11:46:01.919 D/DialogActivity: ========== onStart ==========
- 2019-12-12 11:46:01.925 D/DialogActivity: ========== onResume ==========
##### 关闭Dialog返回Main：
- 2019-12-12 11:46:57.975 D/DialogActivity: ========== onPause ==========
- 2019-12-12 11:46:58.007 D/MainActivity: ========== onResume ==========
- 2019-12-12 11:46:58.026 D/DialogActivity: ========== onStop ==========
- 2019-12-12 11:46:58.028 D/DialogActivity: ========== onDestroy ==========
##### 再次打开Dialog：
- 2019-12-12 11:47:17.149 D/MainActivity: ========== onPause ==========
- 2019-12-12 11:47:17.244 D/DialogActivity: ========== onCreate ==========
- 2019-12-12 11:47:17.259 D/DialogActivity: ========== onStart ==========
- 2019-12-12 11:47:17.263 D/DialogActivity: ========== onResume ==========
##### 关闭Dialog返回Main：
- 2019-12-12 11:47:34.264 D/DialogActivity: ========== onPause ==========
- 2019-12-12 11:47:34.289 D/MainActivity: ========== onResume ==========
- 2019-12-12 11:47:34.305 D/DialogActivity: ========== onStop ==========
- 2019-12-12 11:47:34.307 D/DialogActivity: ========== onDestroy ==========
##### 点击Home返回手机主页面：
- 2019-12-12 11:48:27.302 D/ViewRootImpl[MainActivity]: changeCanvasOpacity: opaque=false
- 2019-12-12 11:48:27.373 D/MainActivity: ========== onPause ==========
- 2019-12-12 11:48:27.478 D/MainActivity: ========== onStop ==========
- 2019-12-12 11:48:27.796 D/ViewRootImpl[MainActivity]: changeCanvasOpacity: opaque=true
##### 结束程序任务：
- 2019-12-12 11:48:54.357 D/MainActivity: ========== onDestroy ==========
