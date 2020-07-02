@Grapes(    @Grab(group='redis.clients', module='jedis', version='3.3.0'))
import redis.clients.jedis.*

Jedis jedis = new Jedis("localhost")
jedis.set("foo", "bar")
String value = jedis.get("foo")
print(value)