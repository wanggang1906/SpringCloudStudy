package com.xyz.demo.controller;


import org.springframework.scheduling.annotation.Scheduled;

/**
 * 用户推荐，结果存储在redis中
 * 来源：https://blog.csdn.net/WoddenFish/article/details/83993593
 * */

public class CfTest {

    //@Scheduled(cron = "0 0 */6 * * ?")
/*    public void getRecommend(){
        try {
            String server = url.substring(url.indexOf("//") + 2, url.lastIndexOf(":"));
            String database = url.substring(url.lastIndexOf("/") + 1, url.lastIndexOf("?"));
            //权重计算使用数据库中的值，也可以使用文件形式
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setServerName(server);
            dataSource.setUser(user);
            dataSource.setPassword(pass);
            dataSource.setDatabaseName(database);
            DataModel model = new MySQLJDBCDataModel(dataSource, "t_itemcf", "user_id", "question_id", "score", "time");

            // 指定用户相似度计算方法，这里采用皮尔森相关度
            UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
            // 指定用户邻居数量，这里为10
            UserNeighborhood neighborhood = new NearestNUserNeighborhood(NEIGHBOORHOODNUM, similarity, model);
            // 构建基于用户的推荐系统
            Recommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);
            // 得到指定用户的推荐结果，这里是得到用户1的两个推荐
            LongPrimitiveIterator iterator=model.getUserIDs();
            while(iterator.hasNext()) {
                long uid=iterator.nextLong();
                List<RecommendedItem> list=recommender.recommend(uid, RECOMMENDNUM);
                for(RecommendedItem item:list) {
                    //删除
                    jedisCluster.zremrangeByRank("recommend:" + uid, Integer.MIN_VALUE, Integer.MAX_VALUE);
                    //加入
                    jedisCluster.zincrby("recommend:" + uid, item.getValue(), item.getItemID()+"");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
