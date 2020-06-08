初步检查：

1. 有对应输入的应该使用`Label`。其它情况使用`Text`
1. `RadioButton`应该有默认选项，且应当放到一个 Group 中
1. 最外层`Vbox`注意 fit to parent，设置 20 的 padding，10 的 spacing
1. `GridPane`设置 5 的 vgap。preWidth reset to default. minWidth和maxWidth use pre
1. `Hbox`设置 10 的 spacing
1. `TableView`设置 constrained-resize