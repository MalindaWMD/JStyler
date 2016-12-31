# JStyler
Simple library to style text for JButton, JToggleButton, JLabel, JCheckBox, JRadioButton

Download here (https://malindawmd.github.io/JStyler/)

# Usage

Add jar to your project. Simply create a object of `JStyler`.

` JStyler styler = new JStyler();`

* Add link
  `styler.addLink(YOUR_LINK, LINK_TEXT);`
  
* Add heading
  Small heading -  
  `styler.addHeading(YOUR_TEXT, JStyler.Style.SMALL);`
  
  Medium heading -  
  `styler.addHeading(YOUR_TEXT, JStyler.Style.MEDIUM);`
  
  Large heading -  
  `styler.addHeading(YOUR_TEXT, JStyler.Style.LARGE);`
  
* Add link break
  `styler.addBreak();`
  
* Add image
  `styler.setImage(IMAGE_PATH)`
  
* Center all elements
  `styler.centerAll()`
  
Now you can set styled text to your component using
  `new JButton(styler.getStyledText());`

![demo image](http://i.imgur.com/KyOZPeA.png)
       
