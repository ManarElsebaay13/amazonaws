# amazonaws

:point_right: Clean Architecture:

<div align="center">
<img src="https://user-images.githubusercontent.com/39746086/213506049-30c52195-3f6d-4076-8bcb-f39e709fff87.png">
</div>



:point_right: Presentation Layer:
-----------------
<div align="center">
<img src="https://user-images.githubusercontent.com/39746086/213504907-467a0b0a-4dd7-487a-987e-03c7785aa0f7.png">

</div>


:point_right: Architecture:
-----------------

- Following Clean Architecture.
- MVVM Architecture.
- Repository pattern.
- Use Cases.
- Applying SOLID principles, each class has a single job with separation of concerns by making classes independent
  of each other and communicating with interfaces.

:point_right: Tech Stack & Libraries:
-----------------

- Navigation component - navigation graph for navigating and replacing screens/fragments
- DataBinding - allows to more easily write code that interacts with views and replaces ```findViewById```.
- ViewModel - UI related data holder, lifecycle aware.
- Dagger-Hilt for dependency injection. Object creation and scoping is handled by Hilt.
- Kotlin Coroutines - for managing background threads with simplified code and reducing needs for callbacks
- Retrofit2 - to make REST requests to the web service integrated.

:point_right: Project Structure:
-----------------

- Tasks contains the following screens :

    - Splash.
    - Products.
    - Product Details.

   

    
 # ScreenShots


<img height=300 width=150 src="https://user-images.githubusercontent.com/39746086/213531035-ebe524c5-9811-4006-8680-92653e0de499.png" hspace=24/> <img height=300 width=150 src="https://user-images.githubusercontent.com/39746086/213531152-14713b1c-be10-4aa3-a3aa-8f158ce6bd7e.png" hspace=24/> <img height=300 width=150 src="https://user-images.githubusercontent.com/39746086/213531300-32749eb0-d2ea-4ff3-9a6f-de76f72d2aad.png" hspace=24/> <img height=300 width=150 src="https://user-images.githubusercontent.com/39746086/213531386-d007401e-fe11-4f10-97c7-d62f667118ae.png" hspace=24/> 


:warning: License:
--------

```
 MIT License

Copyright (c) 2023 Manar Elsebaay

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
```
