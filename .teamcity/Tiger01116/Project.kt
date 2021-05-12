package Tiger01116

import Tiger01116.buildTypes.*
import Tiger01116.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01116")
    name = "Tiger01116"

    vcsRoot(Tiger01116_cVCSroot)

    buildType(Tiger01116_Hi2)
    buildType(Tiger01116_Hi3)
    buildType(Tiger01116_Hi0)
    buildType(Tiger01116_Hi1)
})
