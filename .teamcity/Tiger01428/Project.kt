package Tiger01428

import Tiger01428.buildTypes.*
import Tiger01428.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01428")
    name = "Tiger01428"

    vcsRoot(Tiger01428_cVCSroot)

    buildType(Tiger01428_Hi0)
    buildType(Tiger01428_Hi1)
    buildType(Tiger01428_Hi2)
    buildType(Tiger01428_Hi3)
})
