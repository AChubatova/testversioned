package Tiger01332

import Tiger01332.buildTypes.*
import Tiger01332.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01332")
    name = "Tiger01332"

    vcsRoot(Tiger01332_cVCSroot)

    buildType(Tiger01332_Hi2)
    buildType(Tiger01332_Hi3)
    buildType(Tiger01332_Hi0)
    buildType(Tiger01332_Hi1)
})
