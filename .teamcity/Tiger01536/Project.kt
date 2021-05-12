package Tiger01536

import Tiger01536.buildTypes.*
import Tiger01536.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01536")
    name = "Tiger01536"

    vcsRoot(Tiger01536_cVCSroot)

    buildType(Tiger01536_Hi1)
    buildType(Tiger01536_Hi0)
    buildType(Tiger01536_Hi3)
    buildType(Tiger01536_Hi2)
})
