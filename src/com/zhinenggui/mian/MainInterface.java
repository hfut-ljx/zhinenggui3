package com.zhinenggui.mian;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class MainInterface {
    //主方法入口
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{
            new MainFrame().setVisible(true);
                }
        );
    }


    /**
     * FileName: MainInterface.java
     * 窗体以及诸多窗体元素的建立
     * @author 李家祥
     * @Date    2021/4/8
     * @version 1.00
     */
    static class MainFrame extends JFrame {
        public MainFrame() {
            // 主窗体
            JDialog mainForm = new JDialog();
            mainForm.setTitle("智能柜");
            // 主窗体设置大小
            mainForm.setSize(2000, 1000);
            // 主窗体设置位置
            mainForm.setLocation(0, 0);
            // 主窗体设置布局器为FlowLayout,顺序布局器
            mainForm.setLayout(null);

            //设置label，背景图片
            JLabel mainLabel = new JLabel();

            try{
                //根据图片创建ImageIcon对象
                ImageIcon i = new ImageIcon("C:\\Users\\ljx\\Desktop\\zhinenggui\\picture\\首页\\组 14.jpg");
                //设置ImageIcon
                mainLabel.setIcon(i);
                //label的大小设置为ImageIcon,否则显示不完整
                mainLabel.setBounds(0, 0, i.getIconWidth(), i.getIconHeight());
            }
            catch(Exception e){
                System.out.println("C:\\Users\\ljx\\Desktop\\zhinenggui\\picture\\首页\\组 14.jpg不存在");
                e.printStackTrace();
            }

            JButton check = new JButton("盘点");
            check.setBounds(1000, 300, 300, 300);
            JButton user_management = new JButton("用户管理");
            user_management.setBounds(1350, 300, 300, 200);
            JButton query = new JButton("查询");
            query.setBounds(1000, 650, 300, 200);
            JButton in_out = new JButton("出入柜");
            in_out.setBounds(1350, 550, 300, 300);

            check.addActionListener(new ActionListener() {

                // 当按钮被点击时，就会触发 ActionEvent事件
                // actionPerformed 方法就会被执行
                public void actionPerformed(ActionEvent e) {

                }
            });

            user_management.addActionListener(new ActionListener() {

                // 当按钮被点击时，就会触发 ActionEvent事件
                // actionPerformed 方法就会被执行
                public void actionPerformed(ActionEvent e) {
                    // 根据外部窗体实例化JDialog
                    JDialog form_user = new JDialog(mainForm);
                    // 设置为模态
                    form_user.setModal(true);
                    form_user.setTitle("用户管理");
                    form_user.setSize(2000, 1000);
                    form_user.setLocation(0, 0);
                    form_user.setLayout(null);

                    //设置label，背景图片
                    JLabel form_user_label = new JLabel();
                    try{
                        //根据图片创建ImageIcon对象
                        ImageIcon i = new ImageIcon("C:\\Users\\ljx\\Desktop\\zhinenggui\\picture\\增加删除用户界面\\用户管理底图.jpg");
                        //设置ImageIcon
                        form_user_label.setIcon(i);
                        //label的大小设置为ImageIcon,否则显示不完整
                        form_user_label.setBounds(0, 0, i.getIconWidth(), i.getIconHeight());
                    }
                    catch(Exception e_form_user){
                        System.out.println("C:\\Users\\ljx\\Desktop\\zhinenggui\\picture\\增加删除用户界面\\用户管理底图.jpg");
                        e_form_user.printStackTrace();
                    }

                    JButton user_increase = new JButton("增加用户");
                    user_increase.setBounds(550, 300, 400, 400);
                    JButton user_delete = new JButton("删除用户");
                    user_delete.setBounds(1050, 300, 400, 400);

                    form_user.add(form_user_label);
                    form_user.add(user_increase);
                    form_user.add(user_delete);

                    user_increase.addActionListener(new ActionListener() {

                        public void actionPerformed(ActionEvent e) {

                            JDialog form_user_increase = new JDialog(form_user);
                            form_user_increase.setModal(true);
                            form_user_increase.setTitle("新增用户");
                            form_user_increase.setSize(2000, 1000);
                            form_user_increase.setLocation(0, 0);
                            form_user_increase.setLayout(null);

                            //设置label，背景图片
                            JLabel form_user_increase_label = new JLabel();
                            try{
                                //根据图片创建ImageIcon对象
                                ImageIcon i = new ImageIcon("C:\\Users\\ljx\\Desktop\\zhinenggui\\picture\\增加删除用户界面\\用户管理底图.jpg");
                                //设置ImageIcon
                                form_user_increase_label.setIcon(i);
                                //label的大小设置为ImageIcon,否则显示不完整
                                form_user_increase_label.setBounds(0, 0, i.getIconWidth(), i.getIconHeight());
                            }
                            catch(Exception e_form_user_increase){
                                System.out.println("C:\\Users\\ljx\\Desktop\\zhinenggui\\picture\\增加删除用户界面\\用户管理底图.jpg");
                                e_form_user_increase.printStackTrace();
                            }

                            form_user_increase.add(form_user_increase_label);
                            form_user_increase.setVisible(true);
                        }
                    });

                    user_delete.addActionListener(new ActionListener() {

                        public void actionPerformed(ActionEvent e) {
                            JDialog form_user_delete = new JDialog(form_user);
                            form_user_delete.setModal(true);
                            form_user_delete.setTitle("删除用户");
                            form_user_delete.setSize(2000, 2000);
                            form_user_delete.setLocation(0, 0);

                            //设置label，背景图片
                            JLabel form_user_delete_label = new JLabel();
                            try{
                                //根据图片创建ImageIcon对象
                                ImageIcon i = new ImageIcon("C:\\Users\\ljx\\Desktop\\zhinenggui\\picture\\增加删除用户界面\\用户管理底图.jpg");
                                //设置ImageIcon
                                form_user_delete_label.setIcon(i);
                                //label的大小设置为ImageIcon,否则显示不完整
                                form_user_delete_label.setBounds(0, 0, i.getIconWidth(), i.getIconHeight());
                            }
                            catch(Exception e_form_user_delete){
                                System.out.println("C:\\Users\\ljx\\Desktop\\zhinenggui\\picture\\增加删除用户界面\\用户管理底图.jpg");
                                e_form_user_delete.printStackTrace();
                            }

                            form_user_delete.add(form_user_delete_label);
                            form_user_delete.setVisible(true);
                        }
                    });
                    form_user.setVisible(true);
                }
            });

            query.addActionListener(new ActionListener() {

                // 当按钮被点击时，就会触发 ActionEvent事件
                // actionPerformed 方法就会被执行
                public void actionPerformed(ActionEvent e) {

                }
            });

            in_out.addActionListener(new ActionListener() {

                // 当按钮被点击时，就会触发 ActionEvent事件
                // actionPerformed 方法就会被执行
                public void actionPerformed(ActionEvent e) {


                }
            });

            mainForm.add(check);
            mainForm.add(user_management);
            mainForm.add(query);
            mainForm.add(in_out);
            mainForm.add(mainLabel);
            // 窗体大小不可变化
            mainForm.setResizable(false);
            // 关闭窗体的时候，退出程序
            mainForm.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            // 让窗体变得可见
            mainForm.setVisible(true);

            System.out.println("当前线程是否是 事件调度线程: " + SwingUtilities.isEventDispatchThread());

        }
    }

}
