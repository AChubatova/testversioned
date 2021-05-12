package Tiger01424

import Tiger01424.buildTypes.*
import Tiger01424.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01424")
    name = "Tiger01424"

    vcsRoot(Tiger01424_cVCSroot)

    buildType(Tiger01424_Hi2)
    buildType(Tiger01424_Hi3)
    buildType(Tiger01424_Hi0)
    buildType(Tiger01424_Hi1)
})
